package ver5;



public class PhoneInfor implements Info {

	// private : 변수에 직접 참조를 막는다, 정보 은닉
	private String name; // 이름 저장
	private String phoneNumber; // 전화번호 저장
	private String address;
	private String email;

	public PhoneInfor(String name, String phoneNumber, String address, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}


	String getName() {
		return name;
	}

	public void showAllInfo() {
		System.out.println("주소 :"+this.address);
		System.out.println("이메일 :"+this.email);
		System.out.println("이름 :" + this.name);
		System.out.println("전화번호 :" + this.phoneNumber);
	}

	boolean checkName(String name) {
		return this.name.equals(name);
	}

}
