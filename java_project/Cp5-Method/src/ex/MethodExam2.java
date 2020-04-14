package ex;

public class MethodExam2 {

	public static void main(String[] args) {
	
		calculate(5, 10);
			
			
			
	
	
	}
	
	public static void calculate(int n1, int n2) {
		if(n1 < 0 && n2 < 0) {
			System.out.println(-n1+" "+-n2);
		}else if(n1 < 0) {
			System.out.println(-n1+" "+n2);
		}else if(n2 <0) {
			System.out.println(n1+" "+-n2);
		}else
			System.out.println(n1+" "+n2);
	}
	

}
