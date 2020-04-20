package ex;

public class Ex2_1 {

	public static void main(String[] args) {
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 15;
		if (10 < x && x < 20) {
			System.out.println(x);
		}

		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		// 공백 = 32 탭 = 9
		char ch = '	';
		if (ch != ' ' && ch != '\t') {
			System.out.println(ch);
		}

		// 3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		char ch1 = 'X';
		if (ch1 == 'x' || ch1 == 'X') {
			System.out.println(ch1);
		}
		// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식

		char ch2 = '9';
		if (47 < ch2 && ch2 < 58) {
			System.out.println(ch2);
		}

		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		char ch3 = 'z';
		// a~z= 97~122 A~Z= 65~90
		if ('a' <= ch3 && ch3 <= 'z' || 'A' <= ch3 && ch3 <= 'Z') {
			System.out.println(ch3);
		}
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로나눠떨어지지않을 때 true인 조건식
		int year =0 ;
		if(year%400==0||year%4==0&&year%100!=0) {
			System.out.println(year);
		}
		
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = false;
		powerOn =!powerOn;
		
		String str = "yes";
		if(str == "yes") {
			System.out.println("111");
		}
		//[2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		int i = 0;
		while(i<20) {
			if(i%2!=0 && i%3!=0) {
				i += i;
				System.out.println(i);
				i++;
				
			}
			
		}
			int sum=0;
		for(int j=1; j<11; j++) {
			sum += j;
			System.out.println(sum);
		}
	}

}

	
	

