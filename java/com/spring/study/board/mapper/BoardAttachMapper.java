package com.spring.study.board.mapper;

import java.util.List;

import com.spring.study.board.domain.BoardAttachDTO;

public interface BoardAttachMapper {
	public void insert(BoardAttachDTO boardAttachDto);
	public void delete(String uuid);
	public List<BoardAttachDTO> findByBno(int bno);
	
	public void deleteAll(int bno);
}
