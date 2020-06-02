package ver5;

public class PhoneCafeInfor extends PhoneInfor {


	String cafeName;
	String nickName;

	public PhoneCafeInfor(String name, String phoneNumber, String address, String email, String cafeName,
			String nickName) {
		super(name, phoneNumber,address,email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	public void showAllInfo() {

		super.showAllInfo();
		System.out.println("동호회이름 : " + this.cafeName);
		System.out.println("닉네임 : " + this.nickName);
	}

}
