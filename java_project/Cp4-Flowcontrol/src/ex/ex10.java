package ex;

public class ex10 {

	public static void main(String[]args) {

		char ch = 'b';

		char lowerCase = (ch > 64 && ch <91) ? (char)(ch+32) : ch;

		System.out.println("ch:"+ch);

		System.out.println("chto lowerCase:"+lowerCase);

		}

}
