package co.kr.chocoworld.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.kr.chocoworld.domain.DiaryVO;
import co.kr.chocoworld.mapper.DiaryMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class DiaryServiceImpl implements DiaryService {
	
	private DiaryMapper dmapper;

	@Override
	public List<DiaryVO> getList() {
		// TODO Auto-generated method stub
		log.info("getList.....");
		return dmapper.getList();
	}

	@Override
	public void register(DiaryVO diary) {

		log.info("register......" + diary);

		dmapper.insertSelectKey(diary);

		
	}

	@Override
	public DiaryVO get(Long dbno) {

		log.info("get......" + dbno);

		return dmapper.read(dbno);

	}

}
