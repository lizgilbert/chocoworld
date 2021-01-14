package com.spring.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.study.domain.SampleDTO;
import com.spring.study.domain.SampleDTOList;
import com.spring.study.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample")
//@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping("")
	public void basic() {
		logger.info("basic1 ...................");
		log.info("basic2 ......................");
	}

	@RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
	public void basicGet() {
		logger.info("basicGet1 ...................");
		log.info("basicGet2 ......................");
	}

	@RequestMapping(value = "/basic1", method = RequestMethod.POST)
	public void basicPost() {
		logger.info("basicPost1 ...................");
		log.info("basicPost2 ......................");
	}

	@RequestMapping(value = "/basic1", method = RequestMethod.GET)
	public void basicGet2() {
		logger.info("basicGet3 ...................");
		log.info("basicGet4 ......................");
	}

	@GetMapping("/basicOnlyGet")
	public void basicGet3() {
		logger.info("basic get only5 ...................");
		log.info("basic get only6 ......................");
	}

	@PostMapping("/basicOnlyGet")
	public void basicPost2() {
		logger.info("basic post only7 ...................");
		log.info("basic post only8 ......................");
	}

	@GetMapping("/ex01")
	public String ex01(SampleDTO sDto) {
		logger.info("" + sDto);
		log.info(sDto);

		return "ex01";
	}

	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String superName, @RequestParam("age") int superAge) {
		log.info("superName : " + superName);
		log.info("superAge : " + superAge);

		return "ex02";
	}

	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids : " + ids);

		return "ex02List";
	}

	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
			log.info("Array ids : " + Arrays.toString(ids));

		return "ex02List";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("list dtos : " + list);
		
		return "ex02Bean";
	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		log.info("todo : " + todo);
		
		return "ex03";
	}
	
	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) { SimpleDateFormat
	 * dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 * 
	 * binder.registerCustomEditor(java.util.Date.class, new
	 * CustomDateEditor(dateFormat, false)); }
	 */
	@RequestMapping("/sampleModel")
	public String smapleModel(Model model) {
		SampleDTO sampleDTO = new SampleDTO("홍길동", 18);
		
		log.info("smapleModel");
		
		model.addAttribute(sampleDTO);
		
		return "/sample/sample";
	}
	
	@RequestMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		
		log.info("dto : " + dto);
		log.info("page : " + page);
		
		return "/sample/ex04";
	}
	
	@RequestMapping(value = "/doE")
	public String doE(RedirectAttributes rttr) {
		log.info("doE 호출됨 ......................");
		rttr.addFlashAttribute("msg", "리다이렉트된 메세지 입니다.");
		
		return "redirect:/sample/doF";
	}
	
	@RequestMapping("/doF")
	public String doF(String msg) {
		log.info("doF 호출됨 ......................");
		
		return "/sample/redirectAttributeResult";
	}
	
	@RequestMapping("/ex05")
	public void ex05() {
		log.info("ex05 ...............");
	}
	
	@RequestMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("ex06 ...............");
		
		SampleDTO dto = new SampleDTO();
		dto.setName("홍길동");
		dto.setAge(18);
		
		return dto;
	}

	
	@RequestMapping("/ex06_2")
	public @ResponseBody Map<String, List<SampleDTO>> ex06_2() {
		log.info("ex06_2 ...............");
		List<SampleDTO> list = new ArrayList<>();
		Map<String, List<SampleDTO>> map = new HashMap<>();
		
		SampleDTO dto = new SampleDTO();
		dto.setName("홍길동");
		dto.setAge(18);
		
		list.add(dto);
		
		SampleDTO dto2 = new SampleDTO();
		dto2.setName("김길동");
		dto2.setAge(118);
		
		list.add(dto2);
		
		map.put("info", list);
		
		return map;
	}

	@RequestMapping("/ex07")
	public ResponseEntity<String> ex07() {
		log.info("ex07 ...............");
		
		String msg = "{\"name\":\"홍길동\"}";

		HttpHeaders header = new HttpHeaders();
		header.add("Content-type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<String>(msg, header, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/exFileUpload", method = RequestMethod.GET)
	public void exFileUpload() {
		log.info("/exFileUpload ..............");
	}
	
	@RequestMapping(value = "/exUploadPost", method = RequestMethod.POST)
	public void exUploadPost(ArrayList<MultipartFile> files) throws Exception{
		log.info("/exUploadPost.......................");
		
		files.forEach(file -> {
			log.info("-------------------------------------");
			log.info("fileName : " + file.getOriginalFilename());
			log.info("fileSize : " + file.getSize());
		});
	}
}




















