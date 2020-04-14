package ex;

public class MethodExam1 {
	
	public static void main(String[]args) {
		cal(9,77);
		
		
	}
	public static void cal(int n1, int n2) {
		int r1 = n1 + n2;
		int r2 = n1 - n2;
		int r3 = n1 * n2;
		int r4 = n1 / n2;
		int r5 = n1 % n2;
			
		System.out.println("합:"+r1);
		System.out.println("차:"+r2);
		System.out.println("곱:"+r3);
		System.out.println("나눗셈:"+r4);
		System.out.println("나머자:"+r5);
	}
}
