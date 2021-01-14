package com.spring.study.board.service;

import java.util.List;

import com.spring.study.board.domain.Criteria;
import com.spring.study.board.domain.ReplyDTO;
import com.spring.study.board.domain.ReplyPageDTO;

public interface IReplyService {
	public int register(ReplyDTO replyDto);
	public ReplyDTO read(int rno);
	public int modify(ReplyDTO replyDto);
	public int remove(int rno);
	public List<ReplyDTO> getList(Criteria cri, int bno);
	public ReplyPageDTO getListPage(Criteria cri, int bno);
}
