package reFruit;

public class seller {
	
	int numOfApple = 10;
	int MyMoney = 0;
	final int price = 500;
	
	int saleApple(int money) {
		
		int num = money/price;
		MyMoney += money;
		numOfApple -= num;
		
		return num;
	}
}
