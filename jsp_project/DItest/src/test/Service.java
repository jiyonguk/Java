package test;

public class Service {
//	Dao dao = new Dao();
	
	//Service클래스는 Dao클래스에 의존한다
	
	MemberDao dao;
	
	public void setDao(MemberDao dao) {
		this.dao = dao;
	}
	
	public void print() {
		dao.print();
	}
}
