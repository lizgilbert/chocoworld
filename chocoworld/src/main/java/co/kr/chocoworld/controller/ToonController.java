package co.kr.chocoworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ToonController {

	@RequestMapping(value = "/metoon", method = RequestMethod.GET)
	public String main(RedirectAttributes rttr){
		return "metoon";
	}
	
}
