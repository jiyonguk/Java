package membership;

public class MemberShipMain {

	public static void main(String[] args) {

		// 회원정보 5개를 저장 할 수 있는 배열을 생성
		// Member타입의 인스턴스의 참조값을 저장하는 메모리 공간
		// Member m1,m2,m3,m4,m5
		Member[] members = new Member[5];

		// Member 타입의 인스턴스 주소
		members[0] = new Member("a", "", "");
		members[1] = new Member("b", "", "");
		members[2] = new Member("c", "", "");
		members[3] = new Member("d", "", "");
		members[4] = new Member("e", "", "");

		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
			members[i].showInfo();
			System.out.println("----------------");
		}
		
		Member member = new Member("f", " ", " ");

		member.showInfo();
		System.out.println(member); // member.toString()호출

	}

}
