package ver6;

public class PhoneInfo_basic {
	private int idx;
	private String name;
	private String phonenumber;
	private String email;
	private String address;
	
	
	public PhoneInfo_basic(int idx, String name, String phonenumber, String email, String address) {
		this.idx = idx;
		this.name = name;
		this.phonenumber = phonenumber;
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


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
