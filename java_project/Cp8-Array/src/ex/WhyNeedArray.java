package ex;

import java.util.Scanner;

public class WhyNeedArray {

	public static void main(String[] args) {

		// 점수저장
		int fstHighScore = 0;
		int sndHighScore = 0;

		// 스캐너 선언
		Scanner sc = new Scanner(System.in);

		// 점수입력받음
		System.out.print("점수입력 : ");
		int score1 = sc.nextInt();

		// 점수 비교
		if (score1 >= fstHighScore) {

			// 1등점수보다 클경우 1등점수가 2등점수가됨
			sndHighScore = fstHighScore;
			// 입력받은수가 1등점수가됨
			fstHighScore = score1;
			System.out.println(sndHighScore);
			System.out.println(fstHighScore);
			System.out.println(score1);

			// 입력받은수가 1등점수보다 작고 2등점수보다 클경우
		} else if (score1 < fstHighScore && score1 > sndHighScore) {
			// 2등점수가됨
			sndHighScore = score1;
		}
		//계속 score값을 선언후 반복해야함
		
	}

}
