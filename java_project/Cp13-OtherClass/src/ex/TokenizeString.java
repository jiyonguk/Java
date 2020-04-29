package ex;

import java.util.StringTokenizer;

public class TokenizeString {

	public static void main(String[] args) {

		String strData = "11:22:33:44:55";
		StringTokenizer st = new StringTokenizer(strData, ":");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		String phoneNumber = "Tel 82-02-997-2059 test";

		StringTokenizer st1 = new StringTokenizer(phoneNumber);

		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		StringTokenizer st2 = new StringTokenizer(phoneNumber, " -", true);

		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

	}

}
