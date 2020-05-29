package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args) {
		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
		try {
			
			Class.forName("");
			conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("데이터베이스에 접속했습니다.");
			conn.close();
		} catch (ClassNotFoundException e) {
				
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}
}
