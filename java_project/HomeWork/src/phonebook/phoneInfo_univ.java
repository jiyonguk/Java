package phonebook;

public class phoneInfo_univ extends phoneInfo_basic{
	String major;
	int grade;
	public phoneInfo_univ(int idx, String name, String phoneNumber, String email, String address, String major,
			int grade) {
		super(idx, name, phoneNumber, email, address);
		this.major = major;
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
