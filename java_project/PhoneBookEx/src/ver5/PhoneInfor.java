package ver5;

import java.util.*;

public abstract class PhoneInfor implements Info {

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

	String getName() {
		return name;
	}

	void showBasicInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("전화번호 :" + this.phoneNumber);
		System.out.println("생일 : " + this.birthday);

	}

	// 용욱이형 화이팅!

	// name 속성값과 전달받은 문자열을 비교해서 반환
	boolean checkName(String name) {
		return this.name.equals(name);
	}

}
