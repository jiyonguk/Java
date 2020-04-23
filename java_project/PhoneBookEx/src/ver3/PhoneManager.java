package ver3;

import java.util.Scanner;

/*Project : ver 0.30

배열을 이용해서 프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경. 

아래기능 삽입

저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제

데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.

*/
public class PhoneManager {

	PhoneInfor[] data;

	int cnt;
	Scanner sc = new Scanner(System.in);

	PhoneManager() {
		data = new PhoneInfor[100];
		cnt = 0;

	}

	PhoneInfor createInstance() {

		PhoneInfor info = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String phoneNumber = sc.nextLine();
		System.out.println("생일을 입력해주세요");
		String birthday = sc.nextLine();
		System.out.println("정보를 저장합니다");

		if (birthday.trim().isEmpty() || birthday == null) {
			info = new PhoneInfor(name, phoneNumber);
		} else {

			info = new PhoneInfor(name, phoneNumber, birthday);
		}

		return info;
	}

	void addInfor(PhoneInfor info) {
		data[cnt] = info;
		cnt++;

	}

	void searchInfor(PhoneInfor info) {
		System.out.println("찾으실 이름을 입력해주세요");
		String name = sc.nextLine();

		for (int i = 0; i < cnt; i++) {
			if (data[i].name.equals(name)) {
				info = data[i];
			} else {
				System.out.println("찾으시는 정보가 없습니다");
				break;
			}

		}

	}

	void delInfor(PhoneInfor info) {
		System.out.println("삭제하실 이름을 입력해주세요");
		String name = sc.nextLine();
		
		for(int i = 0; i<cnt; i++) {
			if (data[i].name.equals(name)) {
				info = data[i];
			}
		}
		

	}

}
