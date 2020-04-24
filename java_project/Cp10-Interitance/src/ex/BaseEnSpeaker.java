package ex;

public class BaseEnSpeaker extends Speaker {

	private int baseRate;

//	public void showCurrentState() {
//
//		super.showCurrentState();
//		System.out.println("베이스 크기: " + baseRate);
//
//	}
//	
	public void setBaseRate(int base) {
		this.baseRate = base;
	}

	@Override
	public void showCurrentState() {
		// TODO Auto-generated method stub
		super.showCurrentState();
		System.out.println("베이스  크기: "+baseRate);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "베이스 스피커";
	}
	

}
