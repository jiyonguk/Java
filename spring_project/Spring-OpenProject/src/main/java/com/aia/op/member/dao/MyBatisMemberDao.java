package com.aia.op.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aia.op.member.model.Member;

@Repository
public class MyBatisMemberDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public int insertMember(Member member) {
		String str = "com.aia.op.mybatis.mapper.MemberMapper.insertMember";
		
		return sqlSessionTemplate.update(str, member);
	}

	public Member selectById(String userid) {
		String str = "com.aia.op.mybatis.mapper.MemberMapper.selectById";
		return (Member) sqlSessionTemplate.selectOne(str, userid);
	}
	
	public int delete(int idx) {
		String str = "com.aia.op.mybatis.mapper.MemberMapper.deleteMemeber";
		return sqlSessionTemplate.update(str, idx);
	}

}
