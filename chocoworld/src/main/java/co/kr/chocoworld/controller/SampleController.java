package co.kr.chocoworld.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import co.kr.chocoworld.domain.SampleDTO;
import co.kr.chocoworld.domain.SampleDTOList;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping("")
	public void basic() {

		log.info("basic...................");

	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		
		log.info("basic get only get...................");
		
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {

		log.info("" + dto);

		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {

		log.info("name: " + name);
		log.info("age: " + age);

		return "ex02";
	}
	
	@GetMapping("/ex02Bean")
	public void ex02Bean(@ModelAttribute("slist")SampleDTOList list) {
		
	}
	
	@GetMapping("/exUpload")
	public void exUpload() {
		
	}
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {

		files.forEach(file -> {
      log.info("----------------------------------");
      log.info("name:" + file.getOriginalFilename());
      log.info("size:" + file.getSize());
      log.info("size:" + file.getContentType());
	    });
	  }
}
