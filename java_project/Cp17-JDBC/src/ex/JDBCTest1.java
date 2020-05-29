package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {
	public static void main(String[] args) {

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로드성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속해습니다.");
			
			// 트랜젝션 설정
			conn.setAutoCommit(false);
			
			// 3. Statement : Connection

			//commit : 처리완료
			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			try{
				conn.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}

	}
}
