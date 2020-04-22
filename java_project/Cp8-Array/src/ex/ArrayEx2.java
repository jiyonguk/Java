package ex;

public class ArrayEx2 {
	
	int[]arr;
	
	public static void addOneDArr(int[][] arr, int add) {

		for (int i = 0; i < arr.length; i++) 
			for(int j=0;j < arr[i].length;j++) {
				arr[i][j] += add;
			}
		

	}

	public static void main(String[] args) {

		
		int[][]arr = {1,2}
						{1,2};
		ArrayEx2.addOneDArr(arr, 55);
		
	
	}

}
