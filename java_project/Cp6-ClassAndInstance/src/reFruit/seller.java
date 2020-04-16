package reFruit;

public class seller {
	
	int numOfApple = 10;
	int numOfOrange = 5;
	int MyMoney = 0;
	int ApplePrice = 500;
	int OrangePrice = 200;
	
	int saleApple(int money) {
		
		int num = money/ApplePrice;
		MyMoney += money;
		numOfApple -= num;
		
		return num;
	}
	
	int saleOrange(int money) {
		int num = money/OrangePrice;
		MyMoney += money;
		numOfOrange -= num;
		
		return num;
	}
}
