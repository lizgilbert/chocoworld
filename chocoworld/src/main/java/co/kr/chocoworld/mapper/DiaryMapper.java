package co.kr.chocoworld.mapper;

import java.util.List;

import co.kr.chocoworld.domain.DiaryVO;

public interface DiaryMapper {

	List<DiaryVO> getList();
	
	public void insert(DiaryVO vo);

	public Integer insertSelectKey(DiaryVO vo);
	
	public DiaryVO read(Long dbno);
}
