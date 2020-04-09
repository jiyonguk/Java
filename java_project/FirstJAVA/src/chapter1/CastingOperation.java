package chapter1;

public class CastingOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'A'; // 문자타입의 변수 ch1 선언,초기화 'A'저장 대입
		char ch2 = 'Z'; // 문자타입의 변수 ch2 선언,초기화 'Z'저장 대입
		
		int num1 = ch1; //ch1 char -> int (형변환)
		int num2 = (int)ch2;
		//결과값 출력
		System.out.println("문자 A의 유니코드 값:"+num1);
		System.out.println("문자 Z의 유니코드 값:"+num2);

	}

}
