package ex;

public class Triangle {

	int width;
	int height;
	
	//생성자 : 인스턴스 생성시에 반드시 한번 실행 -> 인스턴스 변수들의 초기화작업
	//		생략 가능(default Contructor)
	
	//기본 생성자
	Triangle(){}
	Triangle(int w,int h){
		width = w;
		height = h;
	}
	
	void setData(int w, int h) {
		width = w;
		height = h;

	}

	// 삼각형의 넓이를 구해서 반환하는 메서드
	float area() {
		float result = width * height / 2f;
		return result;
	}

	public static void main(String[] args) {
		//Triangle t = new Triangle();
		Triangle t = new Triangle(5,3);
		//t.setData(9, 7);
		
		System.out.println(t.width);
		System.out.println(t.height);
		
		System.out.println(t.area());
	}
}