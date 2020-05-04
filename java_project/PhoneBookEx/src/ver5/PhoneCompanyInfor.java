package ver5;

public class PhoneCompanyInfor extends PhoneInfor {
	// 추가되는 정보
	String address;
	String email;
	String company;

	public PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company) {
		super(name, phoneNumber, address, email);

		this.company = company;
	}

	// 오버라이딩
	public void showAllInfo() {
		super.showAllInfo();

		System.out.println("회사 : " + company);
	}

}