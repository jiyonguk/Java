package ex;

public class BusinessMan extends Man {
	
	String company;		//String타입의변수
	String position;
	
	
	BusinessMan(String name,String company,String position){
		super(name);		//상속받은변수 초기화(상위클래스에 생성자를통한 초기화가 이루어졌을때)
		this.company=company;
		this.position=position;
	}
	
//	BusinessMan(){
//		super("kkkk");
//	}
	
	
	void tellYourInfo() {
		//바로위 조상
		super.tellYourName();
//		tellYourName();
		System.out.println("나의 직장이름은"+company+"입니다");
		System.out.println("나의 직급은"+position+"입니다");
		
	}

	@Override
	public String toString() {
		return "BusinessMan [company=" + company + ", position=" + position + "]";
	}
	
	
}