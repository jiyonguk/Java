package ex;

import java.util.Scanner;

public class ExecptionEx {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("나이를 입력해주세요");
//		int age = sc.nextInt();

		try {
			int age = readAge();
			System.out.println("나이는 " + age + "세 입니다");
		} catch (AgeInputException e) {
			System.out.println("");
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

	
	
	static int readAge() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();

		if (age < 0) {
			AgeInputException e = new AgeInputException();

			throw e;
		} // 예외 발생 지점

		return age;

	}
}
