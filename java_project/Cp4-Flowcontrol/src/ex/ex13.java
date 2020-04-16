package ex;

public class ex13 {

	public static void main(String[] args) {
		int num=0;
		for(int i=2; i<10; i *=2) {
			for(int j=1; j<=i; j++) {
				num = j*i;
				System.out.println(i+"*"+j+"="+num);
			}
			
		}

	}

}
