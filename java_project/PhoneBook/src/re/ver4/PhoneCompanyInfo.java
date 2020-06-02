package re.ver4;

public class PhoneCompanyInfo extends PhoneInfo {
	// 추가되는 정보
	String company;
	String dept;
	String job;

	public PhoneCompanyInfo(String name, String phoneNumber, String address, String email, String company, String dept,
			String job) {
		super(name, phoneNumber, address, email);
		this.company = company;
		this.dept = dept;
		this.job = job;
	}

	// 오버라이딩
	void showAllInfo() {
		System.out.println("--회사동료입니다--");
		super.showBasicInfo();
		System.out.println("회사 : " + company);
		System.out.println("부서 : " + dept);
		System.out.println("직급 : " + job);
	}

}