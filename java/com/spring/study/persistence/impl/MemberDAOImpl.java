package com.spring.study.persistence.impl;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessorOrder;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.study.member.domain.MemberDTO;
import com.spring.study.persistence.IMemberDAO;

@Repository
public class MemberDAOImpl implements IMemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.spring.study.memberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMember(MemberDTO mDto) {
		sqlSession.insert(namespace + ".insertMember", mDto);
	}

	@Override
	public MemberDTO selMember(String userid) throws Exception {
		return sqlSession.selectOne(namespace + ".selMember", userid);
	}

	@Override
	public MemberDTO selLoginInfo(String userid, String userpw) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace + ".selLoginInfo", paramMap);
	}

}







