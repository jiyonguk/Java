package ex;

public class SwitchIf {
	public static void main(String[] args) {

		int menuNum = 1;

		if (menuNum == 1) {
			System.out.println("1. Simple JAVA");
		} else if (menuNum == 2) {
			System.out.println("2. Funny JAVA");
		} else if (menuNum == 3) {
			System.out.println("3. Fantastic JAVA");
		} else {
			System.out.println("d. The Best Programming Language");
		}

		System.out.println("Do you like coffee?");
	}
}
