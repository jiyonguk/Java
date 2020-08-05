package com.aia.op.member.dao;

import java.util.List;
import java.util.Map;

import com.aia.op.member.model.Member;


public interface MemberDaoInterface {
	
	public Member selectByIdpw(String uid, String pw);
	public int insertMember(Member member);

	// 전체 게시물의 갯수 : 검색 포함
	public int totalCount(Map serach);
	
	// 전체 게시물의 리스트 List<Member>로 반환
	public List<Member> selectList(Map search);
}