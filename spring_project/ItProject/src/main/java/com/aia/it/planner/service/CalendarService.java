package com.aia.it.planner.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalendarService {

	public List<LocalDate> getDateList(LocalDate startdate, LocalDate enddate) {

		List<LocalDate> dateList = new ArrayList<LocalDate>();

		System.out.println(startdate);
		System.out.println(enddate);

		int betweenday = enddate.getDayOfYear() - startdate.getDayOfYear();

		dateList.add(startdate);

		for (int i = 0; i < betweenday; i++) {

			startdate = startdate.plusDays(1);

			System.out.println(startdate);
			dateList.add(startdate);

		}

		System.out.println(dateList);
		return dateList;
	}
}
