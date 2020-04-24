package version1;

public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneInfor info = new PhoneInfor("지", "000", "000");

		info.showData();
		System.out.println("------------------");
		info = new PhoneInfor("김", "바바바");
		
		info.showData();

	}

}
