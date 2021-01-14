package com.spring.study.member.mapper;

import com.spring.study.member.domain.MemberDTO;

public interface MemberMapper {
	public MemberDTO login(MemberDTO mDto);
	public MemberDTO signup(MemberDTO mDto);
}
