package version2;

public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		
		
		//불필요한 변수 생성과정 분리
		PhoneInfor info = null;
		
		
		
		while (true) {
			info = manager.creatInstance();
			info.showData();
		}

	}

}
