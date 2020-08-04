package com.aia.op.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aia.op.member.model.Member;

@Repository
public class JdbcTemplateMemberDao {

	@Inject
	JdbcTemplate jdbcTemplate;

	public int selectTotalCount() throws SQLException {
		return jdbcTemplate.queryForObject("select count(*) from project.member", Integer.class);
	}

	public List<Member> selectList(int startRow, int count) throws SQLException {

//		List<Member> memberList = new ArrayList<Member>();
//		String sql = "select * from project.member order by uname limit ?, ?";
//		memberList = jdbcTemplate.query(sql,new Object[] {startRow, count}, new MemberRowMapper());
//		return memberList;

		return jdbcTemplate.query("select * from project.member order by idx limit ?, ?",
				new Object[] { startRow, count }, new MemberRowMapper());

	}

	public int insertMember(Member member) {

		return jdbcTemplate.update("INSERT INTO project.member (uid, upw, uname, uphoto ) VALUES (?,?,?,?)",
				new Object[] { member.getUid(), member.getUpw(), member.getUname(), member.getUphoto() });
	}

	public int selectById(String uid) {

		return jdbcTemplate.queryForObject("select count(*) from project.member where uid=?", new Object[] { uid },
				Integer.class);
	}

	public Member selectByIdx(int idx) {

		return jdbcTemplate.queryForObject("select * from project.member where idx = ?", new Object[] { idx },
				new MemberRowMapper());
	}

	public int memberDelete(int idx) {

		return jdbcTemplate.update("delete from project.member where idx=?", new Object[] { idx });
	}

	public int editMember(Member member) {

		return jdbcTemplate.update("update project.member set upw=?, uname=?, uphoto=? where idx=?",
				new Object[] { member.getUpw(), member.getUname(), member.getUphoto(), member.getIdx() });
	}

	public Member selectByIdpw(String uid, String upw) {
		try {
			return jdbcTemplate.queryForObject("select * from project.member where uid=? and upw=?",
					new Object[] { uid, upw }, new MemberRowMapper());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

	}

}
