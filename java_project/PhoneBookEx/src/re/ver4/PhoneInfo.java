package re.ver4;
//PhoneInfor 라는 이름의 클래스를 정의해 보자.
//클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며,
//저장된 데이터의 적절한 출력이 가능하도록 메소드 정의
//• 이름            name            String
//• 전화번호       phoneNumber     String
//• 생년월일       birthday        String 
//단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.

public class PhoneInfo {

	// private : 변수에 직접 참조를 막는다, 정보 은닉
	String name; // 이름 저장
	private String phoneNumber; // 전화번호 저장
	private String address; // 주소 저장
	private String email; // 이메일 저장

	// 초기화를 위한 생성자
	PhoneInfo(String name, String phoneNumber, String address, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}

	// 오버라이딩을위한 메서드
	void showBasicInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("전화번호 :" + this.phoneNumber);
		System.out.println("주소 : " + this.address);
		System.out.println("이메일 : " + this.email);

	}

	void showAllInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("전화번호 :" + this.phoneNumber);
		System.out.println("주소 : " + this.address);
		System.out.println("이메일 : " + this.email);

	}

	
}
