package tv;

public class Tvmain {

	public static void main(String[] args) {

		Tv tv1 = new Tv();
		
		CaptionTv cTv1 = new CaptionTv();
		
		//하위타입의 변수는 상위타입의 변수로변경하는데 문제x
		//자동 형변환
		Tv t= cTv1;
		
		
		//어차피 인스턴스는 메모리 참조변수에 따라서 쓸수있는 범위를 지정하는거
		Tv tv2 = new CaptionTv();
		
		//반대로 들어갈경우 형변환안될경우 많음
		
		IpTv itv3 = (IpTv)tv2;
		// 참조변수 instanceof 타입 형변환가능한지 확인
		
		CaptionTv ctv2 = (CaptionTv)tv2;
		
		ctv2.caption();
		
		//System.out.println(tv2.power);
		tv2.power();
		//System.out.println(tv2.power);
		//System.out.println("-----------------");
		
		//tv2.display();
		
		Tv tv3 = new IpTv();
		Tv tv4 = new SmartTv();
		
		//tv3.display();
		//tv4.display();
		Tv[] tvs = new Tv[4];
		
		tvs[0] = new Tv();
		tvs[1] = new CaptionTv();
		tvs[2] = new IpTv();
		tvs[3] = new SmartTv();
		
		for(int i = 0;i<tvs.length;i++) {
			tvs[i].display();
			System.out.println(i+"TV");
		}
		
		
	}

}
