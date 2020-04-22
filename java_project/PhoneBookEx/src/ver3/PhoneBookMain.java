package ver3;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneManager manager = new PhoneManager();
		PhoneInfor info = null;
		while(true) {
		info = manager.createInstance();
		manager.addInfor(info);
		info.showInfo();
		manager.searchInfor(info);
		info.showInfo();
		System.out.println("------------------------");
		}
		
	
	}

}
