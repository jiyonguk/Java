package test;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class JavaLocalDateExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plusDays(1);
		System.out.println("일 추가 : " + date);
		date = date.plusMonths(1);
		System.out.println("월 추가 : " + date);

		LocalDate parseDate = LocalDate.parse("2019-11-12");
		LocalDate parseDate2 = LocalDate.parse("2019-12-20");
		System.out.println("문자열 파싱 : " + parseDate);
		
		System.out.println(parseDate2.compareTo(parseDate));

	}
}