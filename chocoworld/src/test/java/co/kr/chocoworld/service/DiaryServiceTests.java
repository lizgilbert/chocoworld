package co.kr.chocoworld.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.chocoworld.domain.DiaryVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
// @ContextConfiguration(classes = {org.zerock.config.RootConfig.class} )
@Log4j
public class DiaryServiceTests {
	
	@Setter(onMethod_ = { @Autowired })
	private DiaryService service;

	@Test
	public void testGetList() {

		// service.getList().forEach(board -> log.info(board));
		service.getList().forEach(diary -> log.info(diary));
	}
	
	@Test
	public void testRegister() {

		DiaryVO diary = new DiaryVO();
		diary.setTitle("새로 작성하는 글");
		diary.setContent("새로 작성하는 내용");
		diary.setWriter("newbie");

		service.register(diary);

		log.info("생성된 게시물의 번호: " + diary.getDbno());
	}
	

	@Test
	public void testGet() {

		log.info(service.get(10L));
	}
}
