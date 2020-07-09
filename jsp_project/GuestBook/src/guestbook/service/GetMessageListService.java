package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import guestbook.dao.MessageDao;
import guestbook.jdbc.ConnectionProvider;
import guestbook.model.Message;
import guestbook.model.MessageListView;

public class GetMessageListService {

	private GetMessageListService() {
	}

	private static GetMessageListService service = new GetMessageListService();

	public static GetMessageListService getInstance() {
		return service;
	}

	private MessageDao dao;

	// 한 페이지에 표현할 메세지의 개수
	private final int MESSAGE_COUNT_PER_PAGE = 3;

	public MessageListView getMessageList(int pageNumber) throws SQLException {

		// 페이지 번호 -> 시작 행, 끝 행
		// dao -> List
		
		//커넥션 생성
		Connection conn = null;
		
		//반환할꺼
		MessageListView messageListView = null;

		try {

			conn = ConnectionProvider.getConnection();

			//dao생성
			dao = MessageDao.getInstance();

			// 페이지의 전체 메세지 구하기
			List<Message> messageList = null;
			// 전체 메세지의 개수
			int messageTotalCount = dao.selectTotalCount(conn); // count 쿼리문으로 전체갯수 반환

			int startRow = 0; //게시물 시작행
			int endRow = 0;	// 게시물 마지막행

			if (messageTotalCount > 0) {

				// 시작 행, 마지막 행
				startRow = (pageNumber - 1) * MESSAGE_COUNT_PER_PAGE + 1; //현제페이지 -1 * 자를갯수+1 (1페이지면 1, 2페이지면 4,) 부터시작
				endRow = startRow + MESSAGE_COUNT_PER_PAGE - 1; // 시작한 수+자를겟수 -1 1시작 3-1 3끝, 4시작 4-1 7끝
				
				messageList = dao.selectMessageList(conn, startRow, endRow);
											
			} else {
				pageNumber = 0;
				messageList = Collections.emptyList();
			}
			
			messageListView = new MessageListView(messageTotalCount, pageNumber, messageList, MESSAGE_COUNT_PER_PAGE, startRow, endRow);
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if(conn != null) {
				conn.close();
				
			}
		}
		
		return messageListView;
	}//method
}//class
