package ex;

import java.util.Scanner;

public class PhoneInfor {

	String name;
	String phoneNumber;
	String birthday;

	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfor(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("이름");
			String name = sc.next();
			System.out.println("핸드폰");
			String phoneNumber = sc.next();
			System.out.println("생일 or x");
			String birthday = sc.next();

			if (birthday.equals("x")) {
				PhoneInfor ph1 = new PhoneInfor(name, phoneNumber);
				System.out.println("이름 : " + ph1.name + " 핸드폰 : " + ph1.phoneNumber);

			}else {
			PhoneInfor ph = new PhoneInfor(name, phoneNumber, birthday);
			System.out.println("이름 : " + ph.name + " 핸드폰 : " + ph.phoneNumber + " 생일 : " + ph.birthday);
			}
		}
	}

}
