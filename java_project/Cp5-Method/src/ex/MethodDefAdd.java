package ex;

public class MethodDefAdd {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryone(12);
		hiEveryone(13);
		hiEveryone(14);
		hiEveryone(15);
		hiEveryone(16);
		hiEveryone(17);
		
		System.out.println("프로그램의 끝");
		

	}
	//인사말 출력, 나이값을 받아서 나이를 출력하는 메서드
	public static void hiEveryone(int age) {
		
		System.out.println("좋은 아침입니다");
		System.out.println("제나이는"+age+"세입니다");
	}

}
