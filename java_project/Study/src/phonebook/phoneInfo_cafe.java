package phonebook;

public class phoneInfo_cafe extends phoneInfo_basic {
	String cafe;

	public phoneInfo_cafe(int idx, String name, String phoneNumber, String email, String address, String cafe) {
		super(idx, name, phoneNumber, email, address);
		this.cafe = cafe;
	}

	public String getCafe() {
		return cafe;
	}

	public void setCafe(String cafe) {
		this.cafe = cafe;
	}
	
}
