package co.kr.chocoworld.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.kr.chocoworld.domain.DiaryVO;
import co.kr.chocoworld.service.DiaryService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Controller
@Log4j
@AllArgsConstructor
public class DiaryController {

  private DiaryService service;
  
  @RequestMapping(value = "/diarylist", method = RequestMethod.GET)
  public void list(Model model) {

    log.info("list");
    model.addAttribute("list", service.getList());

  }
  
  @RequestMapping(value = "/diary", method = RequestMethod.GET)
  public String diary() {

	  return "diary";
  }
  
  @RequestMapping(value = "/diary")
  public String registerDiary(DiaryVO diary, RedirectAttributes rttr) {
	  service.register(diary);
	  return "redirect:/main";
  }
  
  @RequestMapping(value = "/get", method = RequestMethod.GET)
	 public void get(@RequestParam("dbno") Long dbno, Model model) {
	 log.info("/get");
	 model.addAttribute("diary", service.get(dbno));
	 }

}


