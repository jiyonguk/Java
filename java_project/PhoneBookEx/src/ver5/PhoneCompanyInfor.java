package ver5;

public class PhoneCompanyInfor extends PhoneInfor {
	//추가되는 정보
	String address;
	String email;
	String company;

	public PhoneCompanyInfor(String name, String phoneNumber,String birthday, String address, String email, String company ) {
		super(name, phoneNumber,birthday);
		this.address = address;
		this.email = email;
		this.company = company;
	}
	//오버라이딩
	public void showAllInfo() {
		showBasicInfo();
		System.out.println("주소 : "+address);
		System.out.println("이메일 : "+email);
		System.out.println("회사 : "+company);
	}

	
	
}