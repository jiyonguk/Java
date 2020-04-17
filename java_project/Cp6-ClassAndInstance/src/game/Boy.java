package game;



public class Boy {
	// 구슬의 개수
	int numOfMarble;

	Boy(int num) {
		numOfMarble = num;
	}

	// 구슬의 개수 설정
	void setMarble(int num) {

		numOfMarble = num;

	}

	void gameWin(Boy boy, int num) {
		numOfMarble += num;
		boy.numOfMarble -= num;
	}

	void showData() {

		System.out.println("현재 보유한 구슬의 개수는 " + numOfMarble + "개 입니다. ㅇㅁ?");
	}

	public static void main(String[] args) {

		// 철수 생겅
		Boy boy1 = new Boy(15);
		// 영희 생성
		Boy boy2 = new Boy(9);

		// 철수 구슬 15개 , 영희 구슬 9개
		// boy1.setMarble(15);
		// boy2.setMarble(9);

		System.out.println("철수");
		boy1.showData();
		System.out.println("영희");
		boy2.showData();
		System.out.println("----------------------");

		// 1차 게임 철수는 영희의 구슬 2개획득
		System.out.println("1차 게임 철수는 영희의 구슬 2개획득");

		boy1.gameWin(boy2, 2);
		System.out.println("철수");
		boy1.showData();
		System.out.println("영희");
		boy2.showData();
		System.out.println("--------------------");

		// 2차게임 영희는 철수의 구슬 7개획득
		System.out.println("2차게임 영희는 철수의 구슬 7개획득");

		boy2.gameWin(boy1, 7);
		System.out.println("철수");
		boy1.showData();
		System.out.println("영희");
		boy2.showData();
		System.out.println("----------------------");
	}

}
