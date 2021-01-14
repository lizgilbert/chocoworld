package com.spring.study.service;

import java.util.List;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.study.board.domain.BoardAttachDTO;
import com.spring.study.board.domain.Criteria;
import com.spring.study.domain.BoardDTO;

public interface IBoardService {
	public String main();
	public void register(BoardDTO bDto) throws Exception;
	public BoardDTO read(Integer bno) throws Exception;
	public boolean modify(BoardDTO bDto) throws Exception;
	public boolean remove(Integer bno) throws Exception;
	public List<BoardDTO> listAll(Criteria cri) throws Exception;
	public int getTotalCnt(Criteria cri) throws Exception;
	public List<BoardAttachDTO> getAttachList(int bno);
}















