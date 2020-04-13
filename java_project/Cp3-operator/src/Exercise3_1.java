
public class Exercise3_1 {

	public static void main(String[] args) {

		/*
		 * 셋째 자리에서 반올림 해야한다
		 */
		int f = 100;
		float c = (int)(((5/9F * (f - 32))*100)+0.5)/100f;
		//float temp = c/100;
		//float result = 0;

		/*if ((int) temp % 10 >= 5) { // 5보다 컸을 때

			temp = temp / 10;
			++temp;
			result = temp / 100f;

		} else { // 5보다 작았을 때
			temp = temp / 10;
			result = temp / 100f;
		}*/

		System.out.println("답 = " + c );
	}
}