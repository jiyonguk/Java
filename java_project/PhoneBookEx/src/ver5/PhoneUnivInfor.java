package ver5;

public class PhoneUnivInfor extends PhoneInfor {

	// 추가되는 정보
	String address;
	String email;
	String major;
	int year;

	PhoneUnivInfor(String name, String phoneNumber,String birthday, String address, String email, String major, int year) {
		super(name, phoneNumber,birthday);
		this.address = address;
		this.email = email;
		this.major = major;
		this.year = year;
	}
	//오버라이딩
	public void showAllInfo() {
		showBasicInfo();
		System.out.println("주소 : " + address);
		System.out.println("이메일 : " + email);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);

	}

	

}
