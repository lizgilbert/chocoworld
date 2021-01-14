package com.spring.study.persistence.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.study.board.domain.Criteria;
import com.spring.study.domain.BoardDTO;
import com.spring.study.persistence.IBoardDAO;

@Repository
public class BoardDAOImpl implements IBoardDAO {
	
	@Autowired
	private SqlSession session;
	
	@Override
	public void create(BoardDTO bDto) throws Exception {
		session.insert("BoardMapper.create", bDto);
	}

	@Override
	public BoardDTO read(Integer bno) throws Exception {
		return session.selectOne("BoardMapper.read", bno);
	}

	@Override
	public int update(BoardDTO bDto) throws Exception {
		return session.update("BoardMapper.update", bDto);
	}

	@Override
	public int delete(Integer bno) throws Exception {
		return session.delete("BoardMapper.delete", bno);
	}

	@Override
	public List<BoardDTO> listAll(Criteria cri) throws Exception {
		return session.selectList("BoardMapper.getListWithPaging", cri);
	}

	@Override
	public int getTotalCnt(Criteria cri) throws Exception {
		return session.selectOne("BoardMapper.getTotalCnt", cri);
	}

	@Override
	public void updateViewCnt(Integer bno) throws Exception {
		session.update("BoardMapper.updateViewCnt", bno);
	}

	@Override
	public void updateReplyCnt(Integer bno, int amount) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("bno", bno);
		paramMap.put("amount", amount);
		
		session.update("BoardMapper.updateReplyCnt", paramMap);
	}

}


















