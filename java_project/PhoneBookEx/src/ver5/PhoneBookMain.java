package ver5;

import java.util.InputMismatchException;



public class PhoneBookMain {

	//
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance(); // 불필요한 변수 생성과정 분리

		while (true) {

			Menu.showMenu();

			int selectNum = 0;

			try {
				selectNum = manager.sc.nextInt();

				// 정상범위 1~6
				// INSERT ~ EXIT
				if (!(selectNum >= MenuInterface.ADD && MenuInterface.EXIT >= selectNum)) {

					BadNumberException e = new BadNumberException("메뉴 범위를 벗어나는 번호입니다\n다시확인후 입력해주세요");
					// 강제적인 예외 발생
					throw e;
				}

			} catch (InputMismatchException e) {
				System.out.println("정상적인 메뉴번호의 입력이 되지 않았습니다.");
				System.out.println("메뉴를 다시 입력해주세요");
				continue;
			} catch (BadNumberException e) {
				System.out.println("메뉴 범위를 벗어나는 번호입니다\n다시확인후 입력해주세요");
				continue;
			} catch(Exception e){
				System.out.println("메뉴를 다시 입력해주세요");
				continue;
			}finally {
				manager.sc.nextLine();
			}

			switch (selectNum) {
			case MenuInterface.ADD:
				manager.addInfo();
				break;
			case MenuInterface.SEARCH:
				manager.searchInfo();
				break;
			case MenuInterface.DELETE:
				manager.deleteInfo();
				break;
			case MenuInterface.ALL_DATA:
				manager.showAllData();
				break;
			case MenuInterface.EXIT:
				// return;
				System.out.println("프로그램이 종료되었습니다");
				System.exit(0);

				break;
			case MenuInterface.EDIT:
				manager.editInfo();
			}

		}

	}

}
