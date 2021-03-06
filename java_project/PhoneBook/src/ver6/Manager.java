package ver6;

import java.util.Scanner;

public class Manager {

	Scanner sc = new Scanner(System.in);
	PhoneInfoDao dao;
	
	void insert() {
		
		PhoneInfo_basic info = null;
		
		System.out.println("----------------");
		System.out.println("-----정보입력------");
		System.out.println("1.대학 2.회사 3.동호회");
		System.out.println("----------------");
		int num = sc.nextInt();
		sc.nextLine();
		
		int idx = 0;
		System.out.println("이름");
		String name = sc.nextLine();		
		System.out.println("전화번호");
		String phonenumber = sc.nextLine();
		System.out.println("이메일");
		String email = sc.nextLine();
		System.out.println("주소");
		String address = sc.nextLine();
		
		switch(num) {
		case 1:
			System.out.println("전공");
			String major = sc.nextLine();
			System.out.println("학년");
			int year = sc.nextInt();
			sc.nextLine();
			info = new PhoneInfo_univ(idx, name, phonenumber, email, address, major, year);
			break;
		case 2:
			System.out.println("회사이름");
			String company = sc.nextLine();
			info = new PhoneInfo_com(idx, name, phonenumber, email, address, company);
			break;
		case 3:
			System.out.println("동호회이름");
			String cafename = sc.nextLine();
			info = new PhoneInfo_cafe(idx, name, phonenumber, email, address, cafename);
			break;
		}
		
		dao.insert(info);
		
	}
	
	
	void delete() {
		
		System.out.println("삭제하실 정보의 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		dao.delete(name);
	}
	
	void search() {
		
		System.out.println("검색하실 정보의 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		dao.search(name);
	
	}
	
	
}
