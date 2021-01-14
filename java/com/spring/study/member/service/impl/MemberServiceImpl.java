package com.spring.study.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.study.member.domain.MemberDTO;
import com.spring.study.member.mapper.MemberMapper;
import com.spring.study.member.service.IMemberService;

@Service
public class MemberServiceImpl implements IMemberService {
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public MemberDTO login(MemberDTO mDto) {
		return mapper.login(mDto);
	}

	@Override
	public MemberDTO signup(MemberDTO mDto) {
		return mapper.signup(mDto);
	}
}












