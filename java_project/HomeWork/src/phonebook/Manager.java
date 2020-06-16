package phonebook;

import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	void manager() {
		System.out.println("원하시는 기능을 선택해주세요.");
		System.out.println("1.전체정보 2.저장 3.검색 4.수정 5.삭제");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			search();
			break;
		case 4:
			break;
		case 5:
			delete();
			break;
		}
	}
	
	void infoList() {
		
	}
	
	void search() {
		
	}
	
	void delete() {
		
	}
	
	void edit() {
		
	}
	
	void showInfo() {
		
		
	}
	
	void searchName() {
		
	}
	
	void addInfo() {
		
		phoneInfo_basic info = null;
		System.out.println("1.학교 2.회사 3.동호회");
		int idx = 0;
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("이름");
		String name = sc.nextLine();
		System.out.println("전화번호");
		String phoneNumber = sc.nextLine();
		System.out.println("이메일");
		String email = sc.nextLine();
		System.out.println("주소");
		String address = sc.nextLine();
		
		switch(num) {
		case 1:
			System.out.println("전공");
			String major = sc.nextLine();
			System.out.println("학년");
			int grade = sc.nextInt();
			sc.nextLine();
			
			info = new phoneInfo_univ(idx, name, phoneNumber, email, address, major, grade);
			break;
			
		case 2:
			System.out.println("회사이름");
			String company = sc.nextLine();
			
			info = new phoneInfo_com(idx, name, phoneNumber, email, address, company);
			break;
			
		case 3:
			System.out.println("카페이름");
			String cafe = sc.nextLine();
			
			info = new phoneInfo_cafe(idx, name, phoneNumber, email, address, cafe);
			break;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
