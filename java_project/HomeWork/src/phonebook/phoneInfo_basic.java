package phonebook;

public class phoneInfo_basic {
	int idx;
	String name;
	String phoneNumber;
	String email;
	String address;
	
	public phoneInfo_basic(int idx, String name, String phoneNumber, String email, String address) {
		
		this.idx = idx;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
