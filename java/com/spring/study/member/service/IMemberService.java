package com.spring.study.member.service;

import com.spring.study.member.domain.MemberDTO;

public interface IMemberService {
	public MemberDTO login(MemberDTO mDto);
	public MemberDTO signup(MemberDTO mDto);
}
