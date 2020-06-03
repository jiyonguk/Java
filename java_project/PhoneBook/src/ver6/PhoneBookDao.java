package ver6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import manager.ConnectionProvider;
import manager.Dept;

public class PhoneBookDao {

	void edit() {

	}

	void delete() {

	}

	int insert(PhoneBook info, int num) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		int resultCnt = 0;

		try {
			conn = ConnectionProvider.getConnection();
			String sql;
			switch (num) {
			case 1:
				sql = "insert into phonebook"
						+ " (pidx, pbname, pbphonenumber, pbaddr, pbemail, pbtype, pbmajor, pbgrade)"
						+ " values(?,?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, info.getPidx());
				pstmt.setString(2, info.getPbname());
				pstmt.setString(3, info.getPbphonenumber());
				pstmt.setString(4, info.getPbemail());
				pstmt.setString(5, info.getPbaddr());
				pstmt.setString(6, info.getPbtype());
				pstmt.setString(7, info.getPbmajor());
				pstmt.setInt(8, info.getPbgrade());
				break;
			case 2:
				sql = "insert into phonebook"
						+ " (pidx, pbname, pbphonenumber, pbaddr, pbemail, pbtype, pbcompany, pbdept, pbjob)"
						+ " values(?,?,?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, info.getPidx());
				pstmt.setString(2, info.getPbname());
				pstmt.setString(3, info.getPbphonenumber());
				pstmt.setString(4, info.getPbemail());
				pstmt.setString(5, info.getPbaddr());
				pstmt.setString(6, info.getPbtype());
				pstmt.setString(7, info.getPbcompany());
				pstmt.setString(8, info.getPbdept());
				pstmt.setString(9, info.getPbjob());
				break;
			case 3:
				sql = "insert into phonebook"
						+ " (pidx, pbname, pbphonenumber, pbaddr, pbemail, pbtype, pbcafe, pbnickname)"
						+ " values(?,?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, info.getPidx());
				pstmt.setString(2, info.getPbname());
				pstmt.setString(3, info.getPbphonenumber());
				pstmt.setString(4, info.getPbemail());
				pstmt.setString(5, info.getPbaddr());
				pstmt.setString(6, info.getPbtype());
				pstmt.setString(7, info.getPbcafe());
				pstmt.setString(8, info.getPbnickname());
				break;
			}

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			// 4. 데이터베이스 연결 종료
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return resultCnt;
	}

	void search() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = ConnectionProvider.getConnection();

			String sql = "select pbname,pbphonenumber from phonebook where pbname = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "호이호이");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	List<PhoneBook> phoneBookList() {

		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<PhoneBook> list = new ArrayList<>();

		try {
			conn = ConnectionProvider.getConnection();

			String sql = "select * from phonebook";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				PhoneBook info = new PhoneBook(rs.getInt("pidx"), rs.getString("pbname"), rs.getString("pbphonenumber"),
						rs.getString("pbemail"), rs.getString("pbaddr"), rs.getString("pbtype"),
						rs.getString("pbmajor"), rs.getInt("pbgrade"));
				list.add(info);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 4. 데이터베이스 연결 종료
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return list;

	}

	int pbSeq() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		int idx = 0;

		try {
			conn = ConnectionProvider.getConnection();

			String sql = "SELECT pb_SEQ.nextval FROM DUAL";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				idx = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 4. 데이터베이스 연결 종료
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

		System.out.println(idx);
		return idx;
	}

	String checkType(String pbname) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		String type = "";

		try {
			conn = ConnectionProvider.getConnection();
			String sql = "select pbtype from phonebook where = '?'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pbname);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString(1));
				type = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 4. 데이터베이스 연결 종료
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}

		return type;

	}

	public List<PhoneBook> Search(String name) {

		// JDBC 사용 객체
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<PhoneBook> list = new ArrayList<PhoneBook>();

		try {

			conn = ConnectionProvider.getConnection();

			String sql = "select * from phonebook  where pbname = ? ";
			// String sql = "select * from dept where dname=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (checkType(name).equals("univ")) {
				while (rs.next()) {
					list.add(new PhoneBook(rs.getInt("pidx"), rs.getString("pbname"), rs.getString("pbphonenumber"),
							rs.getString("pbaddr"), rs.getString("pbemail"), rs.getString("pbtype"),
							rs.getString("pbmajor"), rs.getInt("pbgrade")));
				}
			} else if (checkType(name).equals("com")) {
				while (rs.next()) {
					list.add(new PhoneBook(rs.getInt("pidx"), rs.getString("pbname"), rs.getString("pbphonenumber"),
							rs.getString("pbaddr"), rs.getString("pbemail"), rs.getString("pbtype"),
							rs.getString("pbcompnay"), rs.getString("pbdept"), rs.getString("pbjob")));
				}
			} else if (checkType(name).equals("cafe")) {
				while (rs.next()) {
					list.add(new PhoneBook(rs.getInt("pidx"), rs.getString("pbname"), rs.getString("pbphonenumber"),
							rs.getString("pbaddr"), rs.getString("pbemail"), rs.getString("pbtype"),
							rs.getString("pbcafe"), rs.getString("pbnickname")));
				}
			}

			// 4. 데이터베이스 연결 종료
			// pstmt.close();
			// conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			// 4. 데이터베이스 연결 종료
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}

		return list;

	}

}
