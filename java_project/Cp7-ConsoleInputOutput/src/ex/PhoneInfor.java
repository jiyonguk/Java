package ex;

//import java.util.Scanner;

public class PhoneInfor {
	String name;
	String phoneNumber;
	String birthday;

	void add(String n, String p, String b) {

		name = n;
		phoneNumber = p;
		birthday = b;

	}

	void add(String n, String p) {

		name = n;
		phoneNumber = p;
	}
	
	public static void main(String[]args) {
		PhoneInfor p1 = new PhoneInfor();
		PhoneInfor p2 = new PhoneInfor();
		
		p1.add("지용욱","010","940416");
		
		p2.add("지용욱","010");
		
		System.out.println(p1.name);
		System.out.println(p1.phoneNumber);
		System.out.println(p1.birthday);
		
		System.out.println(p2.name);
		System.out.println(p2.phoneNumber);
		System.out.println(p2.birthday);
	}

}