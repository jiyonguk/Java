package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest6 {

	public static void main(String[] args) {

		// JDBC 사용객체
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		try {
			// 0. 드라이버 라이브러리 추가
			// 1. 데이터베이스 드라이버 로드
			// Class.forname(드라이버 클래스 전체이름)
			// Oracle : oracle.jdbc.driver.OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결

			// String url = "jdbc:oracle:thin:@주소:포트:데이터베이스이름"
			// localhost or 127.0.0.1
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);

			// 3. SQL처리
			// Statement or PreparedStatement
			// pstmt = conn.prepareStatement(SQL 문장)
			String sql = "insert into dept (deptno, dname, loc) "
					+ " values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 70);
			pstmt.setString(2, "마케팅");
			pstmt.setString(3, "서울");

			int resultCnt = pstmt.executeUpdate();

	
			System.out.println("=============================");
			if(resultCnt > 0) {
				System.out.println("정상적으로 입력 되었숩니다.");
				System.out.println(resultCnt + "개 행이 입력되었습니다.");
			}else {
				System.out.println("입력이 되지 않았습니다.");
			}
			System.out.println("=============================");
			// 4. 데이터베이스 연결 종료

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
