package ex;

public class Ex3_4 {

	public static void main(String[] args) {

		//[8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10,  0<=y<=10 이다.
				
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if(x+2*y==5) {
					System.out.println(x+" "+y);
				}
			}
		}
	}

}