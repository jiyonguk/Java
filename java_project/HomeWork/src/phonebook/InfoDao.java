package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InfoDao {

	List<phoneInfo_basic> list(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<phoneInfo_basic> list = new ArrayList<phoneInfo_basic>();
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from phoneinfo_basic";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				phoneInfo_basic info = new phoneInfo_basic(rs.getInt("fr_idx"), rs.getString("name"), rs.getString(""), phoneNumber, email, address);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return list;
	}
}
