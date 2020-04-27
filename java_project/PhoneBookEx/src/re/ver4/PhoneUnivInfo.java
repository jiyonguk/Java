package re.ver4;

public class PhoneUnivInfo extends PhoneInfo {

	// 추가되는 정보
	String major;
	String grade;

	PhoneUnivInfo(String name, String phoneNumber, String address, String email, String major, String grade) {
		super(name, phoneNumber, address, email);
		this.major = major;
		this.grade = grade;
	}

	// 오버라이딩
	void showAllInfo() {
		System.out.println("--대학친구 입니다--");
		super.showBasicInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);

	}

}
