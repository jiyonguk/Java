package ver6;

import java.util.List;
import java.util.Scanner;


public class PhoneBookManager {

	Scanner sc = new Scanner(System.in);
	PhoneBookDao dao = new PhoneBookDao();

	public void manager() {
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.전체정보 2.저장 3.수정 4.삭제 5.검색");
			System.out.println("-------------------------------");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				phoneBookList();
				break;
			case 2:
				insert();
				break;
			case 3:
			case 4:
			case 5:
				Search();
				break;
			}

		}

	}

	public void insert() {

		PhoneBook info = null;

		System.out.println("------------------------");
		System.out.println("1.대학친구 2.회사친구 3.동호회친구");
		System.out.println("------------------------");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.println("-----------------");
		System.out.println("정보를 입력해주세요.");
		System.out.println("-----------------");

		int pidx = dao.pbSeq();
		System.out.println("이름 :");
		String pbname = sc.nextLine();
		System.out.println("전화번호 :");
		String pbphonenumber = sc.nextLine();
		System.out.println("주소:");
		String pbaddr = sc.nextLine();
		System.out.println("이메일 :");
		String pbemail = sc.nextLine();
		String pbtype = "";

		switch (num) {
		case 1:
			pbtype = "univ";
			System.out.println("전공 :");
			String pbmajor = sc.nextLine();
			System.out.println("학년 :");
			int pbgrade = sc.nextInt();
			sc.nextLine();

			info = new PhoneBook(pidx, pbname, pbphonenumber, pbaddr, pbemail, pbtype, pbmajor, pbgrade);
			break;
		case 2:
			pbtype = "com";
			System.out.println("회사이름 :");
			String pbcompany = sc.nextLine();
			System.out.println("부서이름 :");
			String pbdept = sc.nextLine();
			System.out.println("직급 :");
			String pbjob = sc.nextLine();
			info = new PhoneBook(pidx, pbname, pbphonenumber, pbaddr, pbemail, pbtype, pbcompany, pbdept, pbjob);

			break;
		case 3:
			pbtype = "cafe";
			System.out.println("카페이름 :");
			String pbcafe = sc.nextLine();
			System.out.println("닉네임 :");
			String pbnickname = sc.nextLine();
			info = new PhoneBook(pidx, pbname, pbphonenumber, pbaddr, pbemail, pbtype, pbcafe, pbnickname);
			break;
		}

		int resultCnt = dao.insert(info, num);

		if (resultCnt > 0) {
			System.out.println("정상적으로 입력 되었습니다.");
			System.out.println(resultCnt + "행이 입력되었습니다.");
		} else {
			System.out.println("입력이 되지않았습니다. 확인후 재 시도해주세요.");
		}

	}

	public void phoneBookList() {

		List<PhoneBook> list = dao.phoneBookList();

		if (list != null && !list.isEmpty()) {

			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%20s", list.get(i).getPbname() + "\t");
				System.out.printf("%20s", list.get(i).getPbphonenumber() + "\t");
				System.out.printf("%20s", list.get(i).getPbaddr() + "\t");
				System.out.printf("%20s", list.get(i).getPbemail() + "\t");
				System.out.printf("%20s", list.get(i).getPbtype() + "\t");
				System.out.printf("%20s", list.get(i).getPbmajor() + "\n");
			}
		} else {
			System.out.println("입력된 데이터가 없습니다.");
		}

	}
	
	public void Search() {

		// 사용자 입력정보 변수

		System.out.println("검색하고자 하는 이름 : ");
		sc.nextLine();
		String searchName = sc.nextLine();

		List<PhoneBook> list = dao.Search(searchName);

		System.out.println("검색 결과");
		System.out.println("======================================");
		for (PhoneBook pb : list) {
			System.out.printf("%5s", pb.getPidx() + "\t");
			System.out.printf("%12s", pb.getPbname() + "\t");
			System.out.printf("%12s", pb.getPbphonenumber() + "\t");
			System.out.printf("%12s", pb.getPbaddr() + "\t");
			System.out.printf("%12s", pb.getPbemail() + "\t");
			System.out.printf("%12s", pb.getPbtype() + "\t");
			System.out.printf("%12s", pb.getPbmajor() + "\t");
			System.out.printf("%12s", pb.getPbgrade() + "\n");
		}
		System.out.println("======================================");

	}
	String checkName() {
		System.out.println("----------------");
		System.out.println("찾으실 이름을 입력해주세요");
		String pbname = sc.nextLine();
		String type = dao.checkType(pbname);
		
		return type;
	}

}
