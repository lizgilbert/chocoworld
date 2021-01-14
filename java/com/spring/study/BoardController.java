package com.spring.study;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.study.board.domain.BoardAttachDTO;
import com.spring.study.board.domain.Criteria;
import com.spring.study.board.domain.PageDTO;
import com.spring.study.domain.BoardDTO;
import com.spring.study.service.IBoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger =
			LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private IBoardService service;
	
	private String uploadPath = "D:\\workspace\\sts_4.8.1.RELEASE\\springstudy\\src\\main\\webapp\\resources\\fileUpload";
	
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(RedirectAttributes rttr){
		return "/board/main";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Criteria cri, Model model) throws Exception {
		logger.info("show all list .................." + cri);
		
		model.addAttribute("list", service.listAll(cri));
		
		int total = service.getTotalCnt(cri);
		logger.info("total : " + total);
		
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardDTO bDto, Model model) throws Exception{
		logger.info("register get ..................");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(BoardDTO bDto, RedirectAttributes rttr) throws Exception {
		logger.info("register post ..................");
		logger.info("boardDTO : " + bDto.toString());
		
		if (bDto.getAttachList() != null) {
			bDto.getAttachList().forEach(attach -> logger.info("" + attach));
		}
		service.register(bDto);
		
		rttr.addFlashAttribute("result", bDto.getBno());
		
		return "redirect:/board/list";
	}
	
//	@RequestMapping(value = "/read", method = RequestMethod.GET)
//	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
//		model.addAttribute("board", service.read(bno));
//	}

	@RequestMapping(value = {"/read", "/modify"}, method = RequestMethod.GET)
	public void modifyGET(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		logger.info("/read or /modify ...............");
		model.addAttribute("board", service.read(bno));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardDTO bDto, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception {
		logger.info("modify post......" + service.modify(bDto));
		
		if (service.modify(bDto)) {
			rttr.addFlashAttribute("result", "success");
		}
		
//		rttr.addAttribute("pageNum", cri.getPageNum());
//		rttr.addAttribute("amount", cri.getAmount());
//		rttr.addAttribute("type", cri.getType());
//		rttr.addAttribute("keyword", cri.getKeyword());
		
		return "redirect:/board/list" + cri.getListLink();
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception {
		logger.info("remove ..........");
		List<BoardAttachDTO> attachList = service.getAttachList(bno);
		
		if (service.remove(bno)) {
			deleteFiles(attachList);
			rttr.addFlashAttribute("result", "success");
		}
		
//		rttr.addAttribute("pageNum", cri.getPageNum());
//		rttr.addAttribute("amount", cri.getAmount());
//		rttr.addAttribute("type", cri.getType());
//		rttr.addAttribute("keyword", cri.getKeyword());

		return "redirect:/board/list" + cri.getListLink();
	}
	
	@GetMapping(value = "/getAttachList",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<List<BoardAttachDTO>> getAttachList(int bno) {
		logger.info("getAttachList " + bno);
		
		return new ResponseEntity<>(service.getAttachList(bno), HttpStatus.OK);
	}
	
	private void deleteFiles(List<BoardAttachDTO> attachList) {
		if (attachList == null || attachList.size() <= 0) {
			return;
		}
		
		logger.info("delete attach files ................");
		logger.info("" + attachList);
		
		attachList.forEach(attach -> {
			try {
				Path file = Paths.get(uploadPath + "\\" + attach.getUploadPath() + "\\" + attach.getUuid() + "_" + attach.getFileName());
				
				Files.deleteIfExists(file);
				
				if (Files.probeContentType(file).startsWith("image")) {
					Path thumbNail = Paths.get(uploadPath + "\\" + attach.getUploadPath() + "\\s_" + attach.getUuid() + "_" + attach.getFileName());
					Files.delete(thumbNail);
				}
			} catch (Exception e) {
				logger.error("delete file error : " + e.getMessage());
			}
		});
	}
}




















