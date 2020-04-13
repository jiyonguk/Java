package ex;

public class CondOp2 {

	public static void main(String[] args) {
		int num1=5,num2=10;
		int bigNum,diffNum;
		
		if(num1 > num2) {
			bigNum = num1;
			diffNum = num1 - num2;
			
		}else {
			bigNum = num2;
			diffNum = num2 - num1;
		}
		System.out.println(bigNum);
		System.out.println(diffNum);
	}

}
