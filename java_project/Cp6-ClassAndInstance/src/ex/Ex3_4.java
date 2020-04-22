package ex;

public class Ex3_4 {

	// 문제4.전달되는 값이 소수(prime number)인지 아닌지를 판단하여,
	// 소수인경우 true를,
	// 소수가 아닌 경우 false를 반환하는 메서드를 정의하고,
	// 이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.

	boolean prime(int num) {
		boolean result = true;
		if (num <= 1) {
			result = false;
		}
		for (int i = num - 1; i > 1; i--) {

			if (num % i == 0) {
				result = false;
			}

		}
		return result;
	}

	public static void main(String[] args) {

		// 문제4.전달되는 값이 소수(prime number)인지 아닌지를 판단하여,
		// 소수인경우 true를,
		// 소수가 아닌 경우 false를 반환하는 메서드를 정의하고,
		// 이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
		Ex3_4 ex = new Ex3_4();

		for (int i = 0; i < 101; i++) {
			if (ex.prime(i)) {
				System.out.println(i);
			}

		}
	}

}