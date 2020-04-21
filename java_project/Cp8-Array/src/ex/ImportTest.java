package ex;
//기능추가
import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		//java.util.Date
		//날짜와 시간정보를 하나로 표현
		Date today = new Date();
		
		//오늘 날짜,시간 출력
		System.out.println(today); //today.toString()
		
		SimpleDateFormat date =
				new SimpleDateFormat("yyyy.MM.dd. HH:mm");
		
		
		System.out.println("오늘 날짜는 "+date.format(today));
		
	}

}
