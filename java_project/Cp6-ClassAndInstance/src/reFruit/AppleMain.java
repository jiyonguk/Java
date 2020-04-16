package reFruit;

public class AppleMain {

	public static void main(String[] args) {
		seller sell = new seller();
		buyer buy = new buyer();
		
		
		buy.buyApple(sell, 500);
		System.out.println("buy apple");
		System.out.println(buy.MyMoney);
		System.out.println(buy.numOfApple);
		
		System.out.println("--------------");
		System.out.println(sell.MyMoney);
		System.out.println(sell.numOfApple);
		System.out.println("--------------");
		System.out.println("buy orange");
		buy.buyOrange(sell, 400);
		
		System.out.println(buy.MyMoney);
		System.out.println(buy.numOfOrange);
		
		System.out.println("-------------");
		System.out.println(sell.MyMoney);
		System.out.println(sell.numOfOrange);
		
		
		
		System.out.println();

	}

}
