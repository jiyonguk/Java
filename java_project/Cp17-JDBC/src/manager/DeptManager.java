package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class DeptManager {
	
	DeptDao dao = new DeptDao();
	static Scanner sc = new Scanner(System.in);

	void deptManger() {
		System.out.println("=============================");
		System.out.println("1.입력  2.수정  3.삭제  4.검색 5.전체정보");
		System.out.println("=============================");
		int num = sc.nextInt();
		sc.nextLine();
		switch (num) {
		case 1:
			//insert();
			break;
		case 2:
			//reset();
			break;
		case 3:
			//delete();
			break;
		case 4:
			//search();
			break;
		case 5:
			allData();
			break;
		}
	}
	
	public void allData() {
		
		List<Dept> deptList = dao.allDate();
		if(deptList != null && !deptList.isEmpty()){

			for(int i = 0; i < deptList.size(); i++) {
				System.out.printf("%s", deptList.get(i).getDeptno()+"\t");
				System.out.printf("%s", deptList.get(i).getDname()+"\t");
				System.out.printf("%s", deptList.get(i).getLoc()+"\n");
			}
		}
		

	}
}
