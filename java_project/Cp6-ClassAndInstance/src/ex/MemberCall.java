package ex;

public class MemberCall {
	
	//인스턴스 변수
	int iv = 10;
	
	//클래스변수, 스태틱변수
	static int cv = 100;
	
	int iv2 = cv;
	// 스태틱이 먼저처리됨
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod() {
		//스태틱 멤버 출력
		System.out.println(cv);
		
		//인스턴스 멤버 출력
//		System.out.println(iv);
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv);
		
	}
	
	void instanceMethod() {
		//스태틱 멤버 출력
		System.out.println(cv);
		
		//인스턴스 멤버 출력
		System.out.println(iv);
	}
	
	
}
