package phonebook;

public class phoneInfo_com extends phoneInfo_basic {
	String company;

	public phoneInfo_com(int idx, String name, String phoneNumber, String email, String address, String company) {
		super(idx, name, phoneNumber, email, address);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
