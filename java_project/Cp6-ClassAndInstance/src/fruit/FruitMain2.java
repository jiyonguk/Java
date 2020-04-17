package fruit;

public class FruitMain2 {

	public static void main(String[] args) {
		
		//seller 객체생성
		FruitSeller seller1 = new FruitSeller(30, 0, 1000);
		FruitSeller seller2 = new FruitSeller(20, 0, 1500);
		FruitSeller seller3 = new FruitSeller(99);
		
		//buyer 객체생성
		FruitBuyer buyer = new FruitBuyer(10000,0);
		FruitBuyer buyer1 = new FruitBuyer();
		
		//seller1에게 구매
		buyer.buyApple(seller1, 3000);
		buyer1.buyApple(seller1, 5000);
		//seller2에게 구매
		buyer.buyApple(seller2, 3000);
		
		//seller3에게 구매
		buyer.buyApple(seller3, 3000);
		
		System.out.println("판매자 1의 현재 현황");
		seller1.showResult();
		System.out.println("판매자 2의 현재 현황");
		seller2.showResult();
		System.out.println("판매자 3의 현재 현황");
		seller3.showResult();
		
		System.out.println("구매자의 현재현황");
		buyer.showResult();
		System.out.println("구매자1의 현재현황");
		buyer1.showResult();
		
	}

}
