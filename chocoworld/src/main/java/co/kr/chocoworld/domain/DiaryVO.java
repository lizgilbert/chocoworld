package co.kr.chocoworld.domain;

import java.util.Date;

import lombok.Data;

@Data
public class DiaryVO {
	private Long dbno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;

}
