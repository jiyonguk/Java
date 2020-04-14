package fruit;

public class FruitMain {

	public static void main(String[] args) {
		
		
		//셀러 생성 : 인스턴스화
		FruitSeller seller = new FruitSeller();
		// new FruitSeller(); -> 객체 생성, 메모리에 변소,변수의 데이터와 메서드가 저장
		
		//구매자 생성
		FruitBuyer buyer = new FruitBuyer();
		// new FruitBuyer(); -> 객체생성, "
		
		//바이어가 사과를 구매
		buyer.buyApple(seller, 1000);
		System.out.println("구매자가 1000원을 지불해서 사과를 구매 했습니다");
		
		System.out.println("판매자 판매정보 출력");
		System.out.println("현재 사과의 개수 : " + seller.numOfApple);
		System.out.println("판매금액: " + seller.myMoney);
		
		System.out.println("-----------------------");
		System.out.println("구매자의 구매정보 출력");
		System.out.println("현재 보유 금액 : " + buyer.myMoney);
		System.out.println("보유한 사과의 개수: " + buyer.numOfApple);
		
		
	}

}
