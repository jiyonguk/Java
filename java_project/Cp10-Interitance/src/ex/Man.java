package ex;

public class Man {
	String name;	//String타입의 변수
	
	//생성자에서 초기화
	Man(String name){
		this.name=name;
	}
	
	void tellYourName(){
		System.out.println("나의 이름은"+name);
	}
	
}
