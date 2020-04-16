package ex;

public class ex16 {

	public static void main(String[] args) {
//		int num = 1;
//		int sum = 0;
//		while (true) {
//			if (num % 2 == 1 || num % 2 == 0 && num % 3 == 0) {
//
//				sum += num;
//
//			}
//
//			if (sum > 1000) {
//				System.out.println(num);
//				System.out.println(sum);
//				break;
//			}
//			num++;
		int num = 0;
		int sum = 0;
		while (sum < 1000) {
			if (num % 2 == 1 || num % 2 == 0 && num % 3 == 0) {
				sum += num;

			}
			num++;
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
