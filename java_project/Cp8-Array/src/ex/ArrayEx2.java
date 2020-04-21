package ex;

public class ArrayEx2 {
	
	
	
	public static void addOneDArr(int[] arr, int add) {

		for (int i = 0; i < arr.length; i++)
			arr[i] += add;
			
	}

	public static void main(String[] args) {

		

		ArrayEx2 ae = new ArrayEx2();
		int[] arr= new ae.addOneDArr(arr,55);
		System.out.println(ae.addOneDArr(arr, 55));
	}

}
