package ex;

public class ReturnTest {

	public static void main(String[] args) {
		boolean scope= false;
		if(scope) {
			int num = 1;
			num++;
			System.out.println(num);
		}else {
			int num = 4;
			System.out.println(num);
		}
		simple();

	}
	public static void simple() {
		int num = 3;
		System.out.println(num);
	}
	

}
