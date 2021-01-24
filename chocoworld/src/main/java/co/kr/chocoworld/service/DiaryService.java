package co.kr.chocoworld.service;

import java.util.List;

import co.kr.chocoworld.domain.DiaryVO;

public interface DiaryService {
	
	public List<DiaryVO> getList();
	
	public void register(DiaryVO diary);
	
	public DiaryVO get(Long dbno);

}
