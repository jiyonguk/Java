package friend;

import java.util.Scanner;

public class FriendInfoHandler {

	
	//2020 04 28
	//싱글톤 처리
	
	//manager 클래스의 싱글톤 패턴 처리
	//생성자 접근제어지시자 : private
	//인스턴스 생성 금지
	//공동으로 사용할 인스턴스 생성 : static private
	//참조변수 반환 메서드 : static public
	
	private static FriendInfoHandler handler = new FriendInfoHandler(100);
	
	public static FriendInfoHandler getInstance() {
		return handler;
	}
	// Friend 타입의 정보를 저장할 배열을 가진다
	// 친구정보를 저장하는 기능
	// 친구정보의 기본 정보 출력
	// 친구정보 상세 정보 출력 기능

	private Friend[] myFriends; // 친구정보 저장배열 선언
	private int numOfFriend; // 저장된 친구의 정보갯수
	Scanner sc;

	// 초기화 : 저장공간(사이즈) 크기를 받아서 배열 생성
	private FriendInfoHandler(int num) {
		this.myFriends = new Friend[num];
		this.numOfFriend = 0;
		sc = new Scanner(System.in);
	}

	// 친구의 정보를 저장하는 기능
	// 1. 배열에 저장하는기능
	// 2. 사용자에게 데이터를 받아서 사용자 요청에 맞는 인스턴스 생성

	// 1
	void addFriendInfo(Friend f) {
		myFriends[numOfFriend] = f;
		numOfFriend++;

	}

	// HighFriend / UnivFriend
	// 2
	void addFriend(int choice) {

		// 매서드가 사용될때마다 생성
		// Scanner sc = new Scanner(System.in);

		// 기본정보 받기
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String phoneNum = sc.nextLine();
		System.out.println("주소를 입력해주세요");
		String addr = sc.nextLine();

		Friend friend = null;

		// 1일때 정보받기
		// HighFriend 인스턴스 생성
		if (choice == 1) {
			System.out.println("직업을 입력해주세요");
			String work = sc.nextLine();
			friend = new HighFriend(name, phoneNum, addr, work);
			// 2일때 정보받기
			// UnivFriend 인스턴스 생성
		} else {
			System.out.println("전공을 입력해주세요");
			String major = sc.nextLine();
			System.out.println("학년을 숫자로 입력해주세요");
			String grade = sc.nextLine();
			// Integer.parseInt(grade);
			friend = new UnivFriend(name, phoneNum, addr, major, Integer.parseInt(grade));
		}

		// addFriendInfo 호출
		addFriendInfo(friend);

	}
	
	//친구정보의 기본 정보 출력 기능
	void showAllSimpleData() {
		System.out.println("친구의 기본 정보를 출력합니다.");
		for(int i=0;i<numOfFriend;i++) {
			myFriends[i].showBasicInfo();
			System.out.println("-------------------------");
		}
		
	}
	
	void showAllData() {
		System.out.println("친구의 모든 정보를 출력합니다.");
		for(int i=0;i<numOfFriend;i++) {
			myFriends[i].showData();
			System.out.println("-------------------------");
		}
	}
	
	
	
	
	
	
	

}
