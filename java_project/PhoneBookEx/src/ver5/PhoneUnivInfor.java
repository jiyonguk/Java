package ver5;

public class PhoneUnivInfor extends PhoneInfor {

	// 추가되는 정보

	String major;
	String year;

	PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, String year) {
		super(name, phoneNumber, address, email);
		this.major = major;
		this.year = year;
	}

	// 오버라이딩
	public void showAllInfo() {
		super.showAllInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);

	}

}
