package ver3;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PhoneManager manager = new PhoneManager();
		PhoneInfor info = null;

		while (true) {
			
			System.out.println("저장 1. 검색 2. 삭제 3.");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				info = manager.createInstance();
				manager.addInfor(info);
				manager.showAllData();
				break;
			case 2:
				manager.searchInfor(info);
				break;
			case 3:
				manager.delInfor(info);
				break;
			}
		}

	}

}
