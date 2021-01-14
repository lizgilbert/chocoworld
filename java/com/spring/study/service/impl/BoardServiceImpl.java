package com.spring.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.study.board.domain.BoardAttachDTO;
import com.spring.study.board.domain.Criteria;
import com.spring.study.board.mapper.BoardAttachMapper;
import com.spring.study.domain.BoardDTO;
import com.spring.study.persistence.IBoardDAO;
import com.spring.study.service.IBoardService;

@Service
public class BoardServiceImpl implements IBoardService {

	@Autowired
	private IBoardDAO bDao;
	
	@Autowired
	private BoardAttachMapper attachMapper;
	
	@Transactional
	@Override
	public void register(BoardDTO bDto) throws Exception {
		bDao.create(bDto);
		
		if (bDto.getAttachList() == null || bDto.getAttachList().size() <= 0) {
			return;
		}
		
		bDto.getAttachList().forEach(attach -> {attach.setBno(bDto.getBno());
												attachMapper.insert(attach);
												});
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Override
	public BoardDTO read(Integer bno) throws Exception {
		bDao.updateViewCnt(bno);
		return bDao.read(bno);
	}

	@Transactional
	@Override
	public boolean modify(BoardDTO bDto) throws Exception {
		attachMapper.deleteAll(bDto.getBno());
		
		boolean modifyResult = bDao.update(bDto) == 1;
		
		if (modifyResult && bDto.getAttachList().size() > 0) {
			bDto.getAttachList().forEach(attach -> {
				attach.setBno(bDto.getBno());
				attachMapper.insert(attach);
			});
		}
		
		return modifyResult;
	}

	@Transactional
	@Override
	public boolean remove(Integer bno) throws Exception {
		attachMapper.deleteAll(bno);
		return bDao.delete(bno) == 1;
	}

	@Override
	public List<BoardDTO> listAll(Criteria cri) throws Exception {
		return bDao.listAll(cri);
	}

	@Override
	public int getTotalCnt(Criteria cri) throws Exception {
		return bDao.getTotalCnt(cri);
	}

	@Override
	public List<BoardAttachDTO> getAttachList(int bno) {
		return attachMapper.findByBno(bno);
	}

	@Override
	public String main() {
		// TODO Auto-generated method stub
		return "/board/main";
	}

}


















