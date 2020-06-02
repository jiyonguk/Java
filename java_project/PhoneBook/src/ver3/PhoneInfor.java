package ver3;

public class PhoneInfor {
	
	//데이터 저장
	String name;
	String phoneNumber;
	String birthday;
	
	//초기화 생성자
	PhoneInfor(String name,String phoneNumber,String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
//		this(name,phoneNumber,birthday);
	}
	//birthday값을 받지않을때
	PhoneInfor(String name,String phoneNumber){
		this(name, phoneNumber,"입력받지않음");
	}
	
	
	
	
	
	void showInfo() {
		
		System.out.println("이름 : "+this.name);
		System.out.println("전화번호 : "+this.phoneNumber);
		System.out.println("생일 : "+this.birthday);
	}

}
