package ex;

public class Ex3_4M {

	public static void main(String[] args) {
		//배열 생성
		int[] ball = new int[45];
		//1~45 저장
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		int temp = 0;
		int j = 0;
		//랜덤수 출력
		for (int i = 0; i < 100; i++) {
			j = (int) (Math.random() * 45);

			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		//숫자 6개 출력
		for(int i=0; i<6;i++) {
			System.out.print(ball[i]+" ");
		}
	}
}
