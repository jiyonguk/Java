package ver2;

import java.util.Scanner;

/*Project : ver 0.20
"프로그램 사용자로부터 데이터 입력"
프로그램 사용자로부터 데이터를 입력 받아 클래스의 인스턴스를 생성하는 것이
핵심.
단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다.
프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.

키보드로부터 데이터 입력 
↓
입력 받은 데이터로 인스턴스 생성
↓
생성된 인스턴스의 메소드 호출
*/
public class PhoneManager {
	
	//사용자로부터 정보입력
	PhoneInfor createInstance() {
		
		PhoneInfor info = null;					//PhoneInfor타입의 값을 반환하기위해 초기화
		Scanner sc = new Scanner(System.in);	
		System.out.println("정보를 저장하겠습다");
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String phoneNumber = sc.nextLine();
		System.out.println("생일을 입력해주세요");
		String birthday = sc.nextLine();
		
		//birthday값을 받지않아도 되도록 기능부여
		if (birthday.trim().isEmpty() || birthday == null) {
			info = new PhoneInfor(name, phoneNumber);
		} else {

			info = new PhoneInfor(name, phoneNumber, birthday);
		}

		return info;
	}

}
