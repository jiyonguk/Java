package ex;

public class Battle {
	
	void battle(Player p,Monster m){
		
		int result = p.getBaseHealth()-m.getCurrentStrength();
		System.out.println(result);
	}
}
