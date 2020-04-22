package ver2;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		
		PhoneManager manager = new PhoneManager();
		PhoneInfor info = null;
		
		info = manager.createInstance();
		info.showInfo();
		
		
	
	}

}
