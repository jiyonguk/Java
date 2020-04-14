package ex;

public class Method2Param {
	
	public static void main(String[] args) {
	
		double myHeight = 175.9;
		hiEveryone(12,157.5);
		hiEveryone(13,myHeight);
		byEveryone();
		
		
	
	
	}
	//나이값과 키값을 받아서 출력하는 메서드
	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는"+age+"세입니다");
		System.out.println("저의 키는"+height+"cm입니다");
	}
	
	//프로그램 종료 인사말
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다");
	}
}
