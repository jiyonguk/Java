package ex;

public class WhileEx {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		while (sum < 100) {
		if(num%2==0) {
			sum += -num;
			System.out.println(sum);
		}
			sum += num;
			num++;
		System.out.println(sum);
		System.out.println(num);
				
		}
	}
}
