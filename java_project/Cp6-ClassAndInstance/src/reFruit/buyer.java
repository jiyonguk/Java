package reFruit;

public class buyer {
	
	int numOfApple = 0;
	int numOfOrange = 0;
	int MyMoney = 10000;
	
	void buyApple(seller sale, int money) {
		numOfApple += sale.saleApple(money);
		MyMoney -= money;
		
	}
	void buyOrange(seller sale, int money) {
		numOfOrange += sale.saleOrange(money);
		MyMoney -= money;
	}

}
