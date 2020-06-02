package ver6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneBookDao {

	void phoneBookManager() {
		
		
		
		
		
	}
	
	void edit() {
		
	}
	
	void delete() {
		
	}
	
	void insert() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			String sql = "insert into phonebook (pidx,pbname,pbphonenumber,pbaddr,pbemail,pbtype,pbmajor,pbgrade)"
							+" values(?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 1);
			pstmt.setString(2, "호이호이");
			pstmt.setString(3, "호이호이");
			pstmt.setString(4, "호이호이");
			pstmt.setString(5, "호이호이");
			pstmt.setString(6, "univ");
			pstmt.setString(7, "호이호이");
			pstmt.setInt(8, 1);
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void list() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			String sql = "select * from phonebook";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.print(rs.getString(6) + "\t");
				System.out.print(rs.getString(7) + "\n");
				
				
			}
			
					
			rs.close();
			stmt.close();
			conn.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
