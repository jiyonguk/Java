package ex;

import java.util.Scanner;

public class ArrayEx1 {

	// int형 1차원 배열을
	// 매개변수로 전달 받아서
	// 배열에 저장된 최대값,
	// 그리고 최소값을 구해서
	// 반환하는 메소드를 다음의 형태로 각각 정의.

	public static int miniValue(int[] arr) {
		int Min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < Min) {
				Min = arr[i];

			}

		}
		return Min;
	} // 최소값 반환

	public static int maxValue(int[] arr) {
		int Max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > Max) {
				Max = arr[i];

			}

		}
		return Max;

	} // 최대값 반환

// 위의 두 매소드는 인자로 전달되는 배열의 길이에 상관없이 동작
// 두 매소드 실행을 확인인하기 위한 main 메소드 정의.
// int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받고
// 배열의 길이는 임의로 결정

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] value = new int[5];

		for (int i = 0; i < value.length; i++) {
			value[i] = sc.nextInt();
		}

		System.out.println(miniValue(value));
		System.out.println(maxValue(value));

	}
}