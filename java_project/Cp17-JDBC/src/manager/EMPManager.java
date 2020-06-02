package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class EMPManager {

	
	
	
	/////////////////////////////////////////////////////////////////
	// EMP MANAGER
	/////////////////////////////////////////////////////////////////
	
	public void deptManager() {

		System.out.println("DEPT Manager Menu");
		System.out.println("=========================================");
		System.out.println("1. List  2. Insert  3. Search  4. Delete  5. Edit  ");
		System.out.println("=========================================");

		int select = ManageMain.sc.nextInt();

		switch (select) {
		case 1:
			System.out.println("전체 리스트 출력");
			empList();
			break;
		case 2:
			System.out.println("사원 정보를 입력합니다.");
			deptInsert(); // 사용자의 입력데이터 emp 객체에 담아서 dao insert 메서드로 전달
			break;
		case 3:
			System.out.println("사원 정보를 검색합니다.");
			deptSearch(); // 사용자가 입력한 이름을 dao search 전달
			break;
		case 4:
			System.out.println("사원 정보를 삭제합니다.");
			deptDelete(); // 이름 또는 부서번호 dao delete 전달
			break;
		case 5:
			System.out.println("사원 정보를 수정합니다.");
			deptEdit(); // 1. 수정ㅎ고자 하는 데이터 유무 확인 -> 2.사용자로부터 데이터 받아서 전달
			break;

		}

	}
	
	public void empList() {
		
		List<Emp> empList = dao.empList();
	}
	
}
