package ex;

import java.util.Scanner;

public class PhoneInfor {

	String name;
	String phoneNumber;
	String birthday;
	

	
	PhoneInfor(String n,String p,String b){
		name = n;
		phoneNumber = p;
		birthday = b;


		
	}
	PhoneInfor(String n,String p){
		name = n;
		phoneNumber = p;
		
	}
	
	void showData() {
		System.out.println("이름 : "+name+"핸드폰 : "+phoneNumber
				+"생년월일 : "+birthday);
	}
	public static void main(String[]args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름");
		String n1 = sc.nextLine();
		System.out.println("핸드폰번호");
		String p1 = sc.nextLine();
		System.out.println("생년월일");
		String b1 = sc.nextLine();
		
		
		
		PhoneInfor ph = new PhoneInfor(n1,p1,b1);
		
		PhoneInfor ph1 = new PhoneInfor(n1,p1);
		
		
		ph.showData();
		ph1.showData();
		
		
		
	}
		

	}

