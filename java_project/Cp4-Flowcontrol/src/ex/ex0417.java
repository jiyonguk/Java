package ex;

public class ex0417 {

	public static void main(String[] args) {
		// [4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이되는지 구하시오.

		int num = 0;
		int sum = 0;
//		while (sum < 100) {
//
//			num++;
//
//			if (num % 2 == 0) {
//
//				sum += -num;
//
//			} else {
//				sum += num;
//
//			}
//
//		}
//		System.out.println(num);
//		System.out.println(sum);

//		for (int i = 0; i <= 10; i++) {
//
//			for (int j = 0; j <= i; j++)
//
//				System.out.print("*");
//
//			System.out.println();
//
//		}
		while (num <= 10) {

			sum = 0;
			while (sum <= num) {

				System.out.println("*");

				sum++;
			}
			num++;
		}
	} // end of main
}
