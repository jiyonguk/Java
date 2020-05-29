package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest3 {
	public static void main(String[] args) {

		Connection conn = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로드성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속해습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();

			
			Scanner kb = new Scanner(System.in);
			
			System.out.println("회원의 이름을 입력해주세요");
			String searchName = kb.nextLine();
			
			
//			String sql = "select * from emp order by deptno";
//			String sql1 = "select o.orderid, c.name, b.bookname"
//					+" from customer c, orders o, book b"
//					+" where c.custid = o.custid and o.bookid = b.bookid"
//					+" and c.name = '"+searchName+"'";
			String sql2 = "create table ";
			
			
			// select의 결과는 ResultSet이 받는다
			// excuteQuery(sql문) -> ResultSet
			rs = stmt.executeQuery(searchName);

			// ResultSet : next() -> 행의 존재 유무 확인
			
			System.out.println("판매리스트");
			System.out.println("------------------");
			System.out.println("판매아이디\t회원이름\t책이름");
			System.out.println("------------------");
			
			while (rs.next()) {
//				System.out.print(rs.getInt("empno") + "\t");
//				System.out.print(rs.getString("ename") + "\t");
//				System.out.print(rs.getString("job") + "\t");
//				System.out.print(rs.getInt("mgr") + "\t");
//				System.out.print(rs.getString("hiredate") + "\t");
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\n");
				
			}

			rs.close();
			stmt.close();
			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
