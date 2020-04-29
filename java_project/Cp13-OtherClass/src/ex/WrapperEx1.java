package ex;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer("100");

		System.out.println(i1 == i2);

		System.out.println(i1.equals(i2));

		System.out.println(i1.toString());
		System.out.println(i2.toString());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);

		Integer iValue = 10; // new Integer(10); AutoBoxing
		Double dValue = 3.14; // new Double(3.14);

		System.out.println(iValue);
		System.out.println(dValue);
		
		System.out.println(iValue.toString());
		System.out.println(dValue.toString());
		
		int num1 = iValue;
		double num2 = dValue;

		System.out.println(num1);
		System.out.println(num2);
	}

}
