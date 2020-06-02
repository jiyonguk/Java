package ver5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneBookDao {
	
	
	
	int deleteInfo(String pbname) {
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int resultCnt = 0;
		String sql = "delete from phonebook where pbname = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pbname);
			resultCnt = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultCnt;
	}
}
