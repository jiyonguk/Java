package ver6;

public class PhoneInfo_cafe extends PhoneInfo_basic {
	String cafename;

	public PhoneInfo_cafe(int idx, String name, String phonenumber, String email, String address,String cafename) {
		super(idx, name, phonenumber, email, address);
		this.cafename = cafename;
	}

	public String getCafename() {
		return cafename;
	}

	public void setCafename(String cafename) {
		this.cafename = cafename;
	}
	
	
}
