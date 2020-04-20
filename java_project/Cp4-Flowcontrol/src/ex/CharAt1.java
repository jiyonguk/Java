package ex;

public class CharAt1 {

	public static void main(String[] args) {
		String value = "12oo34";

		char ch = ' ';

		boolean isNumber = true;

		// 반복문과 charAt(inti)를 이용해서 문자열의 문자를

		// 하나씩 읽어서 검사한다.

		for (int i = 0; i < value.length(); i++) {
			if ('0' <= value.charAt(i) && value.charAt(i) < '9') {
				isNumber = true;
			} else {
				isNumber = false;
				break;
			}
		}

		if (isNumber) {

			System.out.println(value + "는 숫자입니다.");

		} else {

			System.out.println(value + "는 숫자가 아닙니다.");

		}

	} // end ofmain
}
