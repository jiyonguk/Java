package chapter1;

public class VariableDecl {

	public static void main(String[] args) {
		//실수형 타입의 변수를 선언한다
		double num1, num2, num3, num4, result, result1;
		//변수에 값을 저장한다
		num1 = 1.0000001;
		num2 = 2.0000001;

		//result에 num1과 num2의 합을 저장한다
		result = num1 + num2;
		//값을 출력한다
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(result);
		//확인한결과값의 오류를 해결
		//num3과 num4에 num1과num2의 *10000000을 저장한다
		num3 = num1 * 10000000;
		num4 = num2 * 10000000;
		//num3과num4의 값을 저장한다
		result1 = num3 + num4;
		//저장한값에 곱한값을 나눈후 출력한다
		System.out.println(result1 / 10000000);
	}

}
