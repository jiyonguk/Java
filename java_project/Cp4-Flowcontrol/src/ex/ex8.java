package ex;

public class ex8 {

	public static void main(String[] args) {
		// 1000이하의 자연수 중에서 2의배수이면
		int num = 0;
		int sum = 0;
		while (num < 1000) {
			
			if (num % 2 == 0 && num % 7 == 0) {
				System.out.println(sum += num);
			}
			num++;

		}
	}
}
