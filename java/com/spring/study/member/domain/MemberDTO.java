package com.spring.study.member.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MemberDTO {

	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Timestamp regdate;
	private Timestamp updatedate;
}






