package co.kr.chocoworld.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.chocoworld.domain.DiaryVO;
import co.kr.chocoworld.mapper.DiaryMapper;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java 설정의 경우
// @ContextConfiguration(classes = { org.zerock.config.RootConfig.class })
@Log4j
public class DiaryMapperTests {
	
	@Autowired
	private DiaryMapper dmapper;

	@Test
	public void testGetList() {
		
		log.info("------------------");
		dmapper.getList();
		
	}
	@Test
	public void testInsert() {
		
		DiaryVO vo = new DiaryVO();
		vo.setTitle("테스트 title");
		vo.setContent("테스트 content");
		vo.setWriter("테스트 user");
		
		dmapper.insert(vo);
		
	}
	
	@Test
	public void testinsertSelectKey() {
		
		DiaryVO vo = new DiaryVO();
		vo.setTitle("AA테스트 title");
		vo.setContent("AA테스트 content");
		vo.setWriter("AA테스트 user");
		
		dmapper.insertSelectKey(vo);
		
	}
}
