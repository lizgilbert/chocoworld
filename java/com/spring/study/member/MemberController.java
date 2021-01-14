package com.spring.study.member;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.study.member.domain.MemberDTO;
import com.spring.study.member.service.IMemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	private static final Logger log = 
			LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private IMemberService service;
	
	@GetMapping("/login")
	public void loginGET(@ModelAttribute("mDto") MemberDTO mDto) {
		
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String main(RedirectAttributes rttr){
		return "/member/signup";
	}
	
	@PostMapping("/loginPost")
	public String loginPOST(MemberDTO mDto, HttpSession session, Model model) throws Exception {
		String returnURL = "";
		
		MemberDTO memInfo = service.login(mDto);
		log.info("memInfo =====> " + memInfo);
		
		if (memInfo == null) {
			return "redirect:/member/login";
		}
		
		model.addAttribute("memInfo", memInfo);
		
		return returnURL;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		log.info("logout======================");
		Object obj =  session.getAttribute("login");
		
		if (obj != null) {
			session.removeAttribute("login");
			session.invalidate();
		}
		
		return "redirect:/board/main";
	}
}




















