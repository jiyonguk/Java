package ver6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneInfoDao {

	void insert(PhoneInfo_basic info) {

		Connection conn = null;
		PreparedStatement ptsmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			String sql = "insert into phoneinfo_basic values()";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
