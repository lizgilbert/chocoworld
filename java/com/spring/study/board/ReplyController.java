package com.spring.study.board;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.study.board.domain.Criteria;
import com.spring.study.board.domain.ReplyDTO;
import com.spring.study.board.domain.ReplyPageDTO;
import com.spring.study.board.service.IReplyService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/replies")
@AllArgsConstructor
public class ReplyController {

	private IReplyService service;
	
	private static final Logger log =
			LoggerFactory.getLogger(ReplyController.class);
	
	@PostMapping(value = "/new",
				 consumes = "application/json",
				 produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> creat(@RequestBody ReplyDTO replyDto) {
		log.info("ReplyDTO : " + replyDto);
		
		int insertCount = service.register(replyDto);
		
		log.info("Reply INSERT COUNT : " + insertCount);
		
		return insertCount == 1 
							  ? new ResponseEntity<>("success", HttpStatus.OK)
							  : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping(value = "/pages/{bno}/{page}",
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ReplyPageDTO> getList(@PathVariable("page") int page,
												  @PathVariable("bno") int bno) {
		Criteria cri = new Criteria(page, 10);
		
		log.info("get Reply List bno : " + bno);
		
		log.info("cri : " + cri);
		
		return new ResponseEntity<>(service.getListPage(cri, bno), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{rno}",
				produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}) 
	public ResponseEntity<ReplyDTO> read(@PathVariable("rno") int rno) {
		log.info("get : " + rno);
			
		return new ResponseEntity<>(service.read(rno), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{rno}",
				   produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<String> remove(@PathVariable("rno") int rno) {
		log.info("get : " + rno);
		
		return service.remove(rno) == 1 
				  ? new ResponseEntity<>("success", HttpStatus.OK)
				  : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@RequestMapping(value = "/{rno}",
					method = {RequestMethod.PUT, RequestMethod.PATCH},
					consumes = "application/json",
					produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> modify(@PathVariable("rno") int rno,
										 @RequestBody ReplyDTO replyDto) {
		replyDto.setRno(rno);
		
		log.info("rno : " + rno);
		log.info("modify : " + replyDto);
		
		return service.modify(replyDto) == 1
					? new ResponseEntity<>("success", HttpStatus.OK)
					: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

























