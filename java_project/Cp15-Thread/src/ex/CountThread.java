package ex;

public class CountThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10; i>0; i--) {
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	//1000/1000 초 대기
		}
		
		System.out.println("10초 동안 입력이 없어 프로그램으 종료합니다.");
		System.exit(0);
	}
	
	
}