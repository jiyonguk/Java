package ex;

public class NumberFind {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 21; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				num = num + i;
				System.out.println(i);
			}
		}
		System.out.println(num);
	}
}
