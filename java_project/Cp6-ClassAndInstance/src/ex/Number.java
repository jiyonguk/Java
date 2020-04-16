package ex;

public class Number {
	int num;
	
	//생성자 
	Number(){
		System.out.println("생성자 호출");
		num = 1000;
	}
	
	public static void main(String[]args) {
		
		Number n1=new Number();
		
		System.out.println(n1.num);
		
		
	}
}
