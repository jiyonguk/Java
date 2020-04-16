package card;

public class Card {
	static int width = 110;
	static int height = 220;
	
	String kind;
	int number;
	
	//overloading
	Card(){}
	
	Card(String type, int num){
		kind=type;
		number=num;
	}
	
	
	//생성자를 통한 초기화의 경우 final을 쓸수있다

}
