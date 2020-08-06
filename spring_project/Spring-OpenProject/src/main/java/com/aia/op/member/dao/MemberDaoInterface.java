package com.aia.op.member.dao;

import java.util.List;
import java.util.Map;

import com.aia.op.member.model.Member;
import com.aia.op.member.model.MemberXML;
import com.aia.op.member.model.MemberXmlList;


public interface MemberDaoInterface {
	
	// 전체 xml 회원 리스트
	public List<MemberXML> selectTotalListXml();
	
	public Member selectByIdpw(String uid, String pw);
	
	public List<Member> selectTotalList();
	
	public int insertMember(Member member);

	// 전체 게시물의 갯수 : 검색 포함
	public int totalCount(Map serach);
	
	// 전체 게시물의 리스트 List<Member>로 반환
	public List<Member> selectList(Map search);
}