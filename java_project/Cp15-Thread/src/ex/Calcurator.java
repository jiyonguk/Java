package ex;

public class Calcurator {

	// 메서드 실행 횟수 카운트
	int opCnt = 0;

	 int add(int n1, int n2) {

		System.out.println("덧셈");
		synchronized(this) {opCnt++;}
		return n1 + n2;
	}

	synchronized int min(int n1, int n2) {
		System.out.println("뺄셈");
		synchronized(this) {opCnt++;}
		return n1 - n2;
	}

	void showOpCnt() {
		System.out.println("연산의 횟수는 " + opCnt);
	}
}
