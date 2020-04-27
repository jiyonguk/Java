package ex;

// class 앞에 abstract 키워드가 있는경우 추상클래스
// 추상클래스는 미왕성된 클래스
// 변수의 경우는 미완성x 추상메서드를 하나라도 포함하고있는경우 추상클래스
// 추상메서드 = 미완성된 메서드 abstract type name();
public abstract class Player {

	int currentPos;

	Player() {

	}

	// 추상메서드 : abstract 반환형 메서드이름(메게변수)
	abstract void play(int pos);
	
	// 추상메서드
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
}
