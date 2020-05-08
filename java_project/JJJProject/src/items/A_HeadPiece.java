package items;




public class A_HeadPiece extends Item {

	public A_HeadPiece(String equipmentName, int equipmentType, int attackPower, int health, int evasion, int gold) {
		super(equipmentName, equipmentType, attackPower, health, evasion, gold);

		this.equipmentName = "BrokenSword";
		
		this.equipmentType =1;
		
		this.attackPower = 10;
				
		this.health = 200;
		
		this.evasion = 1;
		
		this.gold = 20;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return "BrokenSword [equipmentName=" + equipmentName + ", equipmentType=" + equipmentType + ", attackPower="
				+ attackPower + ", health=" + health + ", evasion=" + evasion + ", gold=" + gold + "]";
	}

	

}
