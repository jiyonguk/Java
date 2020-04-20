
public class StringRe {

	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		String new_str = "";
		for (int i = str.length() - 1; i > -1; i--) {
			new_str += str.charAt(i);
		}
		System.out.println(new_str);

	}

}
