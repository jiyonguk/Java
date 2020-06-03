package ver6;

public class PhoneInfo_com extends PhoneInfo_basic {
	String company;

	public PhoneInfo_com(int idx, String name, String phonenumber, String email, String address, String company) {
		super(idx, name, phonenumber, email, address);
		this.company = company;
	}
	
	
}
