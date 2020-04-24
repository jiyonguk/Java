package ex;

public class Overriding {

	public static void main(String[] args) {

		// 다형성 : 상위클래스 타입의 참조변수에 하위클래스의 인스턴스를 참조
		Speaker sp = new BaseEnSpeaker();
		// 참조변수 sp는
		//BaseEnSpeaker인스턴스중 
		//Speaker가 가지던 멤버만 사용
		
		sp.showCurrentState();
//		sp.setBaseRate(100);
		
		System.out.println("-------------------");

		BaseEnSpeaker bs = new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
		System.out.println(bs);
	}

}
