package card;

public class CardMain {

	public static void main(String[] args) {

		
		// 인스턴스 생성
		Card c1 = new Card("Heart",9);
//		c1.kind = "Heart";
//		c1.number = 7;
		
		//인스턴스 생성
		Card c2= new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("첫번쨰 카드"+c1.kind+" "+c1.number);
		System.out.println("두번쨰 카드"+c2.kind+" "+c2.number);
		System.out.println("폭"+c1.width+"높이"+c1.height);
		System.out.println("폭"+c2.width+"높이"+c2.height);
		
		System.out.println("카드사이즈변경");
		
		Card.height = 100;
		Card.width = 50;
		
		System.out.println("폭"+c1.width+"높이"+c1.height);
		System.out.println("폭"+c2.width+"높이"+c2.height);

	}

}
