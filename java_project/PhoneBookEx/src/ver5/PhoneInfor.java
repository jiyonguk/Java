package ver5;

import java.util.*;

//PhoneInfor 라는 이름의 클래스를 정의해 보자.
//클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며,
//저장된 데이터의 적절한 출력이 가능하도록 메소드 정의
//• 이름            name            String
//• 전화번호       phoneNumber     String
//• 생년월일       birthday        String 
//단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.

public abstract class PhoneInfor implements Info{

	// private : 변수에 직접 참조를 막는다, 정보 은닉
	private String name; // 이름 저장
	private String phoneNumber; // 전화번호 저장
	private String birthday; // 생일 저장

	// 초기화를 위한 생성자
	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	// 생년월일 저장x
	PhoneInfor(String name, String phoneNumber) {
		// this.name = name;
		// this.phoneNumber = phoneNumber;
		// this(name, phoneNumber, "");
		this(name, phoneNumber, "입력값이 없습니다");
	}

//	void showData() {
//		System.out.println("이름 : " + this.name);
//		System.out.println("전화번호 : " + this.phoneNumber);
//
////		if (this.birthday == null) {
////			System.out.println("생일 : 입력값이 없습니다");
////		} else {
////			System.out.println("이름 : " + this.name);
////			System.out.println("전화번호 : " + this.phoneNumber);
////		}
//		System.out.println("생일 : " + this.birthday);
//
//	}
	

	void showBasicInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("전화번호 :"+ this.phoneNumber);
		System.out.println("생일 : " + this.birthday);
		
	}

	
	
	//name 속성값과 전달받은 문자열을 비교해서 반환
	boolean checkName(String name) {
		return this.name.equals(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
