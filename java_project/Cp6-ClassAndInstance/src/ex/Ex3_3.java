package ex;

public class Ex3_3 {
	
	//원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메서드와 원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고, 이를 호출하는 main메서드를 정의하자. (2*π*r), (π*r∧2)
	
	float area = 0;
	float round = 0;
	final float Pi = 3.14f;
	
	float Area(int r) {
		
		area = Pi*r*r;
		return area;
		
	}
	float Round(int r) {
		round = Pi*2*r;
		return round;
	}
}
