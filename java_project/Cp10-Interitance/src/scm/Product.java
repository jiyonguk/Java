package scm;



//상품 객체들의 상위클래스
public class Product {
	
	//final은 생성자통해 초기화가능
	final int price;		//상품가격
	final int bonusPoint;	//적립금
	
	
	//초기화
	Product(int price){
		this.price = price;
		this.bonusPoint = this.price/10;
	}
	
	
}
