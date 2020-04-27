package ex;

public class AbstractInterfaceMain {

	public static void main(String[] args) {
		//PersonalNumberStorage storage = new PersnalNumberStorageImpl(100);

		PersnalNumber storage = new PersnalNumberStorageImpl(100);
		
		storage.addPersnalInfo("991111-1212121", "손흥민");
		storage.addPersnalInfo("911111-1212121", "박지성");

		System.out.println(storage.searchName("991111-1212121"));
		System.out.println(storage.searchName("911111-1212121"));

	}
}
