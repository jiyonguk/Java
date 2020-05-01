package ver5;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
public class PhoneBookManager {

	private static PhoneBookManager manager = new PhoneBookManager();

	public static PhoneBookManager getInstance() {
		return manager;
	}

	final ArrayList<PhoneInfor> pBooks;

	// 입력된 친구의 정보 개수 -> 입력된 배열의 요소 개수
	// 1. 참조할 때 반복의 횟수
	// 2. 새로운 객체를 저장할 때 index로 사용 -> 저장 할 배열위치와 같음
//	int cnt;

	Scanner sc;

	private PhoneBookManager() {

		// 배열 초기화
//		pBooks = new PhoneInfor[100];
		// 저장개수 초기화
//		cnt = 0;
		// Scanner 객체 초기화
		sc = new Scanner(System.in);
		
		pBooks = new ArrayList<>();
	}

	// 저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
	// 배열에 PhoneInfor타입의 참조값을 저장
//	void addInfo(PhoneInfor info) {
//
//		// 배열에 요소 대입
//		pBooks[cnt] = info;
//
//		// 등록된 정보의 개수를 증가
//		cnt++;
//
//	}

	void addInfo() {

		// 배열에 요소 대입
//		pBooks[cnt] = createInstance();
		pBooks.add(createInstance());
		// 등록된 정보의 개수를 증가
//		cnt++;

	}

	// 사용자의 입력데이터로 PhoneInfor 객체를 생성
	PhoneInfor createInstance() {
		PhoneInfor info = null;

		int num = 0;
		while (true) {
			System.out.println("1.대학친구");
			System.out.println("2.회사친구");

			try {
				num = sc.nextInt();
				// 정상범위 1~3
				if (!(num >= 1 && num <= 2)) {
					BadNumberException e = new BadNumberException("범위를 벗어난 입력입니다");
					// 강제적인 예외발생
					throw e;
				}
			} catch (InputMismatchException e) {
				System.out.println("정상적인 메뉴번호의 입력이 되지 않았습니다.");
				System.out.println("메뉴를 다시 입력해주세요");
				continue;

			} catch (BadNumberException e) {
				System.out.println("정상적인 메뉴번호의 입력이 되지 않았습니다.");
				System.out.println("메뉴를 다시 입력해주세요");
				continue;
			} catch (Exception e) {
				System.out.println("메뉴를 다시 입력해주세요");
				continue;
			} finally {
				sc.nextLine();
			}
			break;
		}

		while (true) {

			System.out.println("친구의 정보를 저장하기 위한 데이터를 입력합니다.");

			System.out.println("이름을 입력해주세요. >>");
			String name = sc.nextLine();

			System.out.println("전화번호를 입력해주세요. >>");
			String phoneNumber = sc.nextLine();

			System.out.println("생일을 입력해주세요. >>");
			String birthday = sc.nextLine();

			System.out.println("주소를 입력해주세요");
			String address = sc.nextLine();

			System.out.println("이메일을 입력해주세요");
			String email = sc.nextLine();

			try {
				if (name.trim().isEmpty() || phoneNumber.trim().isEmpty()) {
					StringEmptyException e = new StringEmptyException("기본정보는 공백없이 모두 입력해주세요\n다시 입력해주세요");
					throw e;
				}
			} catch (StringEmptyException e) {
				System.out.println("기본정보는 공백없이 모두 입력해주세요");
				System.out.println("다시 입력해주세요\n");
				continue;
			}catch(Exception e){
				System.out.println("메뉴를 다시 입력해주세요");
				continue;
			}
			// 사용자의 입력 데이터에 따라 인스턴스 생성 방법 구분
			// trim : 문자열의 양쪽 공백을 제거
			// isEmpty : 비어있음

			switch (num) {
			case MenuInterface.Univ:
				System.out.println("전공을 입력해주세요");
				String major = sc.nextLine();
				System.out.println("학년 입력해주세요");
				String year = sc.nextLine();
				info = new PhoneUnivInfor(name, phoneNumber, birthday, address, email, major, year);
				break;

			case MenuInterface.Company:
				System.out.println("회사를 입력해주세요");
				String company = sc.nextLine();
				info = new PhoneCompanyInfor(name, phoneNumber, birthday, address, email, company);
				break;

			}

			break;
		}

		return info;

	}

	// 전체 리스트 출력
	void showAllData() {

		// 전체 데이터 -> 입력된 데이터의 갯수 cnt
		for (int i = 0; i < pBooks.size(); i++) {
			pBooks.get(i).showAllInfo();
			System.out.println("---------------");
		}

	}

	// 배열에서 이름을 기준으로 검색후 index 값을 반환
	int searchIndex(String name) {
		int searchIndex = -1;
		// 사용자가 입력한 이름으로 배열에 요소를 검색 -> index
		for (int i = 0; i < pBooks.size(); i++) {
			if (pBooks.get(i).checkName(name)) {
				searchIndex = i;
				break;
			}

		}
		return searchIndex;
	}

	// 검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
	// 배열의 요소(PhoneInfor)의 name속성 값으로 배열의 요소를 찾는다
	void searchInfo() {

		System.out.println("검색하고자하는 이름을 입력해주세요");
		String name = sc.nextLine();

		int searchIndex = searchIndex(name);
		// 사용자가 입력한 이름으로 배열에 요소를 검색 -> index
//		for (int i = 0; i < cnt; i++) {
//			if (pBooks[i].checkName(name)) {
//				searchIndex = i;
//				break;
//			}
//
//		}
		if (searchIndex < 0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		} else {
			pBooks.get(searchIndex).showAllInfo();
		}

	}

	// 삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제
	void deleteInfo() {
		System.out.println("삭제하고자하는 이름을 입력해주세요");
		String name = sc.nextLine();

		int searchIndex = searchIndex(name);
		// 사용자가 입력한 이름으로 배열에 요소를 검색 -> index
//		for (int i = 0; i < cnt; i++) {
//			if (pBooks[i].checkName(name)) {
//				searchIndex = i;
//				break;
//			}
//
//		}
		// 삭제
		// pBooks[2] : 삭제, pBooks[2] = null
		// 데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
		// 재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.
		// pBooks[a] : 삭제, pBooks[a] = pBooks[a+1]
		if (searchIndex < 0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		} else {
			// 삭제 : 검색한 index부터 저장된 위치까지 왼쪽으로 시프트
//			for (int i = searchIndex; i < cnt - 1; i++) {
//				pBooks[i] = pBooks[i + 1];
			pBooks.remove(searchIndex);
//			}
			// 저장된 정보의 개수를 -1
//			cnt--;
			System.out.println("요청하신 이름의 정보를 삭제했습니다");
		}

	}

	void editInfo() {

		PhoneInfor info = null;
		System.out.println("수정하실 정보의 이름을 입력해주세요.");
		String name = sc.nextLine();
		int searchIndex = searchIndex(name);

		if (searchIndex < 0) {
			System.out.println("이름의 정보가 없습니다.");
			return;
		} else {
			while (true) {
				System.out.println("핸드폰번호를 입력해주세요");
				String phoneNumber = sc.nextLine();
				System.out.println("생일을 입력해주세요");
				String birthday = sc.nextLine();
				System.out.println("주소를 입력해주세요");
				String address = sc.nextLine();
				System.out.println("이메일을 입력해주세요");
				String email = sc.nextLine();
				try {
					if (phoneNumber.trim().isEmpty() || address.trim().isEmpty() || email.trim().isEmpty()) {
						StringEmptyException e = new StringEmptyException("기본정보는 공백없이 모두 입력해주세요\n다시 입력해주세요");
						throw e;
					}
				} catch (StringEmptyException e) {
					System.out.println("기본정보는 공백없이 모두 입력해주세요");
					System.out.println("다시 입력해주세요\n");
					continue;
				}

				if (pBooks.get(searchIndex) instanceof PhoneCompanyInfor) {
					System.out.println("회사를 입력해주세요");
					String company = sc.nextLine();
					info = new PhoneCompanyInfor(name, phoneNumber, birthday, address, email, company);
				} else if (pBooks.get(searchIndex) instanceof PhoneUnivInfor) {
					System.out.println("전공을 입력해주세요");
					String major = sc.nextLine();
					System.out.println("학년 입력해주세요");
					String year = sc.nextLine();
					info = new PhoneUnivInfor(name, phoneNumber, birthday, address, email, major, year);
				}

				pBooks.remove(searchIndex);
				pBooks.add(searchIndex, info);
				System.out.println("수정완료.");
				break;
			}
		}
	}
}
