package com.spring.study.board.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.study.board.domain.Criteria;
import com.spring.study.board.domain.ReplyDTO;
import com.spring.study.board.domain.ReplyPageDTO;
import com.spring.study.board.mapper.ReplyMapper;
import com.spring.study.board.service.IReplyService;
import com.spring.study.persistence.IBoardDAO;

@Service
public class ReplyServiceImpl implements IReplyService {

	@Autowired
	private ReplyMapper mapper;
	
	@Autowired
	private IBoardDAO boardDao;
	
	private static final Logger log = 
			LoggerFactory.getLogger(ReplyServiceImpl.class);
	
	@Transactional
	@Override
	public int register(ReplyDTO replyDto) {
		log.info("Reply register ........." + replyDto);
		
		try {
			boardDao.updateReplyCnt(replyDto.getBno(), +1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapper.insert(replyDto);
	}

	@Override
	public ReplyDTO read(int rno) {
		log.info("read.............." + rno);
		
		return mapper.read(rno);
	}

	@Override
	public int modify(ReplyDTO replyDto) {
		log.info("modify................" + replyDto);
		return mapper.update(replyDto);
	}

	@Transactional
	@Override
	public int remove(int rno) {
		log.info("remove................" + rno);
		ReplyDTO replyDto = mapper.read(rno);
		
		try {
			boardDao.updateReplyCnt(replyDto.getBno(), -1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapper.delete(rno);
	}

	@Override
	public List<ReplyDTO> getList(Criteria cri, int bno) {
		log.info("getList ............." + bno);
		return mapper.getListWithPaging(cri, bno);
	}

	@Override
	public ReplyPageDTO getListPage(Criteria cri, int bno) {
		return new ReplyPageDTO(mapper.getCountByBno(bno),
								mapper.getListWithPaging(cri, bno));
	}

}


















