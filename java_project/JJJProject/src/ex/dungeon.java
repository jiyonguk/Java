package ex;

import java.util.Scanner;

public class dungeon {

	boolean result;
	Scanner sc;

	dungeon() {
		this.result = false;
		sc = new Scanner(System.in);
	}

	void stage() {

		// battle();

		
	}

	void stageChoice() {

		while (true) {
			System.out.println("스테이지를 선택해주세요.");
			System.out.println("1.EASY 2.NOMAL 3.HARD");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {

			case dungeonIf.EASY:
				EasyStage();
				if (result) {
					System.out.println("실패하셨습니다.");
					continue;
				}
			case dungeonIf.NOMAL:
				NomalStage();
				if (result) {
					System.out.println("실패하셨습니다.");
					continue;
				}
			case dungeonIf.HARD:
				HardStage();
				if (result) {
					System.out.println("실패하셨습니다.");
					continue;
				}
			}
		} // 스테이지 선택 반복

	}

	boolean EasyStage() {
		result=false;
		// rat, chicken, rabbit, boss dog
		return result;
	}

	boolean NomalStage() {
		result=false;
		// monkey, sheep, pig, boss snake
		return result;
	}

	boolean HardStage() {
		result=false;
		// horse, cow, tiger, boss dragon
		return result;
	}

	boolean revelCheck() {
		return false;
	}

}
