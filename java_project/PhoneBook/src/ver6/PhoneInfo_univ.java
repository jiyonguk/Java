package ver6;

public class PhoneInfo_univ extends PhoneInfo_basic{
	private String major;
	private int year;
	
	
	
	public PhoneInfo_univ(int idx, String name, String phonenumber, String email, String address,String major, int year) {
		super(idx,name, phonenumber, email, address);
		this.major = major;
		this.year = year;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	
	
}
