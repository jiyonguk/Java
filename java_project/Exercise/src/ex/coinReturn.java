package ex;

public class coinReturn {
	public static void main(String[] args) {
		// 큰 금액의 동저을 우선적으로 거슬러 줘야함
		int[] coinUnit = { 500, 100, 50, 10 };

		int money = 600;
		System.out.println("money = " + money);
		for (int i = 0; i < coinUnit.length; i++) {
			int result = money / coinUnit[i];
			money -= result*coinUnit[i];
			System.out.println(coinUnit[i]+"="+result);
		}
	}

}
