package ex;

public class Speaker {
	
	private int volumeRate;
	
	public void showCurrentState() {
		System.out.println("볼륨크기: "+volumeRate);
	}
	public void setVolume(int vol) {
		this.volumeRate=vol;
	}
}
