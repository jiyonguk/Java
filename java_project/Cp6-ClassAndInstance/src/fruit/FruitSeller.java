package fruit;


//작성자 : 지용욱
//수정일 : 2020.04.17
//수정내용 : 생성자를 통한 변수 초기화
public class FruitSeller {
	
	//속성 => 변수
	//	사과의 개수
	//	수입
	//	사과의 가격
	//	멤버 변수, 인스턴스 변수
		
//	int numOfApple = 20;	// 사과의 개수
//	int myMoney = 0;		// 수입
//	final int price = 1000;		// 사과의 가격

//	수정 : 변수의 명시적 초기화 변경
	int numOfApple;	// 사과의 개수
	int myMoney;		// 수입
	final int APPLE_PRICE;		// 사과의 가격
	
	//생성자
	FruitSeller(){
//		numOfApple = 20;
//		myMoney = 0;
//		APPLE_PRICE = 1000;
		
		//또다른 생성자 호출,FruitSeller 호출
		this(20, 0, 1000);
	}
	// 같은방식으로 두개못만듬,구별불가
	FruitSeller(int num){
		this(num,0,1500);
	}
	//파란색의 변수는 인스턴스변수
	FruitSeller(int numOfApple, int myMoney, int price){
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRICE = price;
		
	}
	
	
	// 판매기능 : 메서드
	// 1. 돈을 받는다. --> 매개변수 int money
	// 2. 받은 돈의 사과의 개수를 구한다. 
	// 3. 나의 사과 개수에서 반환해야하는 사과의 개수를 빼준다.
	// 4. 받은 금액은 나의 수입으로 더해준다.
	// 5. 사과의 개수를 반환한다. --> 반환 데이터 int return 사과의 개수
	
	int saleApple(int money) {
		int num = money/APPLE_PRICE;
		//numOfApple = numOfApple-num;
		numOfApple -= num;
		myMoney += money;	//myMoney = myMoney + money
		
		return num;
	}
	//20200417 생성 메서드
	void showResult() {
		System.out.println("보유 사과의 갯수 = "+numOfApple+"보유 금액 = "+myMoney);
	}
	

	
	
	
	
}