
public class Exercise1 {

	public static void main(String[] args) {

			byte a = 10;

			byte b = 20;

			byte c = (byte)(a + b); // → int + int 는 byte 보다 크기때문

			char ch = 'A';

			ch = (char)(ch + 2);    // → ch 는  char자료형이기때문에 int + int 값을 char로 변환

			float f = 3f / 2f;   // → 1.5 값이 나오려면 실수로 변환해주어야함

			long l = 3000 * 3000;   //→
				 l = l * 3000;

			float f2 = 0.1f;

			double d = 0.1;

			boolean result = d==f2;    //→ double

			System.out.println("c="+c);

			System.out.println("ch="+ch);

			System.out.println("f="+f);

			System.out.println("l="+l);

			System.out.println("result="+result);

			}

}

/*[실행결과]

c=30

ch=C

f=1.5

l=27000000000

result=true

}

}
*/