package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeptDao {

	// DAO = Data Acess Object
	// 데이터베이스 처리하는 클래스
	
	// MVC -> Model, View, Controller
	// model -> Service, Dao
	// 데이터베이스
	
	void insert() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			conn = DriverManager.getConnection(url, user, pw);

			String sql = "insert into dept01 (deptno, dname, loc) "
					+ " values(?,?,?)";
			System.out.println("========================");
			System.out.println("사원정보입력");
			System.out.println("========================");
			System.out.println("부서번호");
			
			int deptno = MangerMain.sc.nextInt();
			MangerMain.sc.nextLine();

			System.out.println("부서이름");
			String dname = MangerMain.sc.nextLine();

			System.out.println("지역");
			String loc = MangerMain.sc.nextLine();


			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);


			int resultCnt = pstmt.executeUpdate();

			System.out.println("=============================");
			if (resultCnt > 0) {
				System.out.println("정상적으로 입력 되었숩니다.");
			} else {
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

	void reset() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("수정하실 정보의 부서번호를 입력해주세요");
			int deptno = MangerMain.sc.nextInt();
			MangerMain.sc.nextLine();
			String sql = "update dept01 set dname = ?, loc = ? where empno = " + deptno;

			System.out.println("수정정보입력");

			System.out.println("부서이름");
			String dname = MangerMain.sc.nextLine();

			System.out.println("지역");
			String loc = MangerMain.sc.nextLine();


			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);


			int resultCnt = pstmt.executeUpdate();

			System.out.println("=============================");
			if (resultCnt > 0) {
				System.out.println("정상적으로 입력 되었숩니다.");
			} else {
				System.out.println("정보가 없습니다.");
			}
			System.out.println("=============================");

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

	void delete() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			conn = DriverManager.getConnection(url, user, pw);

			String sql = "delete from dept01 where deptno = ?";

			System.out.println("삭제하실 부서번호입력");

			int deptno = sc.nextInt();
			sc.nextLine();

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			int resultCnt = pstmt.executeUpdate();

			System.out.println("=============================");
			if (resultCnt > 0) {
				System.out.println("정상적으로 삭제 되었숩니다.");
			} else {
				System.out.println("삭제하실 정보가 없습니다.");
			}
			System.out.println("=============================");

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

	void search() {
		Connection conn = null;
		ResultSet rs = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();
			
			System.out.println("부서의 이름 혹은 지역을 입력해주세요");
			String search = sc.nextLine();

			String sql = "select * from dept01"
					+ " where dname = '" + search + "' or loc = '" + search +"'" ;

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print("부서번호" + "\t");
				System.out.print("부서이름" + "\t");
				System.out.print("지역" + "\n");
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\n");

			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public List<Dept> allDate() {
		
		// VO : value Object
		// DTO : Data Transfer Object

		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		//Dao 클래스 추가
		List<Dept> deptList = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = ConnectionProvider.getConnection();

			String sql = "select * from dept01";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);

			System.out.print("부서번호" + "\t");
			System.out.print("부서이름" + "\t");
			System.out.print("지역" + "\n");
			while (rs.next()) {
				Dept dept = new Dept(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
				deptList.add(dept);
						
			}



		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		return deptList;

	}
}
