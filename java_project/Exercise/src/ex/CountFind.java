package ex;

import java.util.Scanner;

public class CountFind {
	public static void main(String[] args) {
		//1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random()*100);
		int input = 0;
		int count = 0;
		
		Scanner kb = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요");
			input = kb.nextInt();
			if(answer == input) {
				System.out.println(count);
				break;
			}
		}while(true);
	}
}
