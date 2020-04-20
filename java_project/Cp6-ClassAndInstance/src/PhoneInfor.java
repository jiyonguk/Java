import java.util.Scanner;

public class PhoneInfor {
	Scanner sc = new Scanner(System.in);
	String name;
	String phoneNumber;
	String birthday;

	void Data() {
		System.out.println("이름");
		name = sc.nextLine();
		System.out.println("핸드폰번호");
		phoneNumber = sc.nextLine();
		System.out.println("생일");
		birthday = sc.nextLine();
	}
	void Data(String n, String num) {
		name = n;
		phoneNumber = num;
		
	}
		
	

	public static void main(String[] args) {
		PhoneInfor p1 = new PhoneInfor();
		Scanner sc = new Scanner(System.in);
		p1.Data();
		
		System.out.println(p1.name);
		System.out.println(p1.phoneNumber);
		System.out.println(p1.birthday);
		
		
	}

}
