package re.ver4;

public class PhoneCafeInfo extends PhoneInfo {

	String cafeName; // 동호회이름
	String nickName; // 닉네임

	public PhoneCafeInfo(String name, String phoneNumber, String address, String email, String cafeName,
			String nickName) {
		super(name, phoneNumber, address, email);
		this.cafeName = cafeName;
		this.nickName = nickName;

	}

	@Override
	void showAllInfo() {
		System.out.println("--동호회 멤버 입니다.--");
		super.showBasicInfo();
		System.out.println("동호회이름 : " + cafeName);
		System.out.println("닉네임 : " + nickName);
	}

}
