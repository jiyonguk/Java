package ver1;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		
		
		//정보저장 클래스호출후 정보입력
		PhoneInfor info = new PhoneInfor("지", "010");
		//출력
		info.showInfo();
		System.out.println("-----------------");
		info = new PhoneInfor("지", "010","50510");
		info.showInfo();

	}

}
