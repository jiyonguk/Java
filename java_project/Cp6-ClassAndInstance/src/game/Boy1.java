package game;

public class Boy1 {

	int marble;

	void Player(int num) {
		marble = num;
	}

	void GameWin(Boy1 player, int num) {

		marble += num;
		player.marble -= num;
		
	}
	void ShowData() {
		System.out.println(marble);
	}
	
	
	public static void main(String[]args) {
		
		Boy1 play1 = new Boy1();
		Boy1 play2 = new Boy1();
		
		play1.Player(15);
		play2.Player(9);
		
		play1.ShowData();
		play2.ShowData();
		
		play1.GameWin(play2, 2);
		play2.ShowData();
		play1.ShowData();
		
	}
}

