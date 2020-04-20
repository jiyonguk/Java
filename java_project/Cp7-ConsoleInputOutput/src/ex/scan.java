package ex;

public class scan {
	public static void main(String[] args){

		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.

		int answer =0;

		int input = 0; // 사용자입력을 저장할 공간

		int count = 0; // 시도횟수를 세기위한 변수

		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용

		java.util.Scanner s = new java.util.Scanner(System.in);

		do {
			
		count++;
		answer = (int)(Math.random()*10);

		System.out.print("1과 10사이의 값을 입력하세요 :");

		input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.

		if(answer == input) {
			System.out.println("com "+answer);
			break;
		}else {
			
			System.out.println("다릅니다");
			System.out.println("com "+answer);
		}
			



		} while(true); // 무한반복문
		System.out.println(count);
		} // end of main

} // end ofclass HighLow