package com.spring.study.persistence;

import java.util.List;

import com.spring.study.board.domain.Criteria;
import com.spring.study.domain.BoardDTO;

public interface IBoardDAO {
	public void create(BoardDTO bDto) throws Exception;
	public BoardDTO read(Integer bno) throws Exception;
	public int update(BoardDTO bDto) throws Exception;
	public int delete(Integer bno) throws Exception;
	public List<BoardDTO> listAll(Criteria cri) throws Exception;
	public int getTotalCnt(Criteria cri) throws Exception;
	
	public void updateViewCnt(Integer bno) throws Exception;
	public void updateReplyCnt(Integer bno, int amount) throws Exception;
}























