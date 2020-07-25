package comment.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDao;
import comment.dao.CommentDao;
import comment.model.Comment;
import jdbc.ConnectionProvider;
import service.Service;

public class CommentListServiceImpl implements Service {

	CommentDao dao;
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		Map<Integer, List<Comment>> commentList = new HashMap<>();
		
		List<Integer> idxList = null;
		List<Comment> cList = null;
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = dao.getInstance();
			
			idxList = dao.getBidx(conn);
			
			for(int i=0; i < idxList.size(); i++) {
				cList = dao.commentList(conn, idxList.get(i));
				commentList.put(idxList.get(i), cList);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		System.out.println("31"+commentList.get(31));
		
		request.setAttribute("Comment", commentList);
		
		
		
		
		
		return "/WEB-INF/views/comment/commentList.jsp";
	}

}
