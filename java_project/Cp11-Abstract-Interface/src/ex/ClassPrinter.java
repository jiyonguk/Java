package ex;

public class ClassPrinter {
	public static void print(Object obj) {
		String org = obj.toString();
		if (obj instanceof UpperCasePrintable) {
			org = org.toString();
		}
		System.out.println(org);
	}
}
