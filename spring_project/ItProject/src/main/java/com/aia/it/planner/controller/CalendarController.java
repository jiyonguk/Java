package com.aia.it.planner.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aia.it.planner.service.CalendarService;

@Controller
@RequestMapping("/planner/calendar")
public class CalendarController {
	
	@Autowired
	CalendarService calService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getCalendarForm() {
		return "planner/calendarForm";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String getDailyReg (	@RequestParam("startdate") LocalDate startdate,
								@RequestParam("enddate") LocalDate enddate,
								Model model) {
		
		model.addAttribute("dateList", calService.getDateList(startdate, enddate));
		return "planner/plannerReg";
	}
}
