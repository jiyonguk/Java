package ex;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (float)(kor+eng+math)/3;
	}
	public static void main(String[] args) {
		Student a = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println("이름: "+a.name);
		System.out.println("총점: "+a.getTotal());
		System.out.println("평균: "+a.getAverage());
	}
}
