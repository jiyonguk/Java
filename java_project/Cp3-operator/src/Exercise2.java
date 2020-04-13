
public class Exercise2 {

	public static void main(String[] args) {

		int x = 2;

		int y = 5;

		char c = 'A'; // 'A'의문자코드는 65

		System.out.println(y += 10 - x++); // y = y+10 - x++ , y = 5 + 10 이되고 x값인 2가 더해진후 x값 1추가

		System.out.println(x += 2); //x = 3+2 

		System.out.println(!('A' <= c && c <= 'Z')); // c가 'A'보다 같고 'Z'보다 작으므로 값은 true !연산자로인해 false 출력

		System.out.println('C' - c); // 'C'의 유니코드값 67 - 'A'의 유니코드값 65

		System.out.println('5' - '0'); // '5'의유니코드값 - '0'의 유니코드값

		System.out.println(c + 1); //c의 유니코드값 66 int로 변환 + 1 값 출력

		System.out.println(++c); //char 는 증감연산 형태유지

		System.out.println(c++); //후이형임으로 c값출력후 증가

		System.out.println(c); // 증가된값 "C" 츌룍

	}

}
