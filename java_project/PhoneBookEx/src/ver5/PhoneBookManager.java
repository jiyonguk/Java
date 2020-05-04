package ver5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class PhoneBookManager {

	private static PhoneBookManager manager = new PhoneBookManager();

	public static PhoneBookManager getInstance() {
		return manager;
	}

	final ArrayList<PhoneInfor> pBooks;


	Scanner sc;

	private PhoneBookManager() {


		sc = new Scanner(System.in);

		pBooks = new ArrayList<>();
	}



	void addInfo() {


		pBooks.add(createInstance());


	}


	PhoneInfor createInstance() {
		PhoneInfor info = null;

		int num = 0;
		while (true) {
			System.out.println("1.일반 2.대학 3.회사 4.동호회");

			try {
				num = sc.nextInt();
				// 정상범위 1~3
				if (!(num >= 1 && num <= 4)) {
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
			} catch (Exception e) {
				System.out.println("메뉴를 다시 입력해주세요");
				continue;
			}

			switch (num) {
			case MenuInterface.Nomal:
				info = new PhoneInfor(name, phoneNumber, address, email);
				break;

			case MenuInterface.Univ:
				System.out.println("전공을 입력해주세요");
				String major = sc.nextLine();
				System.out.println("학년 입력해주세요");
				String year = sc.nextLine();
				info = new PhoneUnivInfor(name, phoneNumber, address, email, major, year);
				break;

			case MenuInterface.Company:
				System.out.println("회사를 입력해주세요");
				String company = sc.nextLine();
				info = new PhoneCompanyInfor(name, phoneNumber, address, email, company);
				break;

			case MenuInterface.Cafe:
				System.out.println("동호회 이름을 입력해주세요");
				String cafeName = sc.nextLine();
				System.out.println("닉네임을 입력해주세요");
				String nickName = sc.nextLine();
				info = new PhoneCafeInfor(name, phoneNumber, address, email, cafeName, nickName);

			}

			break;
		}

		return info;

	}

	void showAllData() {

		// 전체 데이터 -> 입력된 데이터의 갯수 cnt
		for (int i = 0; i < pBooks.size(); i++) {
			pBooks.get(i).showAllInfo();
			System.out.println("---------------");
		}

	}

	int searchIndex(String name) {
		int searchIndex = -1;

		for (int i = 0; i < pBooks.size(); i++) {
			if (pBooks.get(i).checkName(name)) {
				searchIndex = i;
				break;
			}

		}
		return searchIndex;
	}

	void searchInfo() {

		System.out.println("검색하고자하는 이름을 입력해주세요");
		String name = sc.nextLine();

		int searchIndex = searchIndex(name);

		if (searchIndex < 0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		} else {
			pBooks.get(searchIndex).showAllInfo();
		}

	}

	void deleteInfo() {
		System.out.println("삭제하고자하는 이름을 입력해주세요");
		String name = sc.nextLine();

		int searchIndex = searchIndex(name);

		if (searchIndex < 0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		} else {

			pBooks.remove(searchIndex);

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
					info = new PhoneCompanyInfor(name, phoneNumber, address, email, company);
				} else if (pBooks.get(searchIndex) instanceof PhoneUnivInfor) {
					System.out.println("전공을 입력해주세요");
					String major = sc.nextLine();
					System.out.println("학년 입력해주세요");
					String year = sc.nextLine();
					info = new PhoneUnivInfor(name, phoneNumber, address, email, major, year);
				} else if (pBooks.get(searchIndex) instanceof PhoneCafeInfor) {
					System.out.println("카페이름을 입력해주세요");
					String cafeName = sc.nextLine();
					System.out.println("닉네임을 입력해주세요");
					String nickName = sc.nextLine();
					info = new PhoneCafeInfor(name, phoneNumber, address, email, cafeName, nickName);
				}else {
					info = new PhoneInfor(name, phoneNumber, address, email);
				}

				pBooks.remove(searchIndex);
				pBooks.add(searchIndex, info);
				System.out.println("수정완료.");
				break;
			}
		}
	}
}
