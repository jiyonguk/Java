package com.aia.it.planner.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aia.it.planner.model.Planner;
import com.aia.it.planner.service.PlannerRegService;

@Controller
@RequestMapping("/planner/plannerReg")
public class PlannerRegController {
	
	@Autowired
	PlannerRegService regService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getPlannerRegForm() {
		return "planner/plannerRegForm";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String getPlannerReg (HttpServletRequest request,
								Planner planner,
								Model model) {
		System.out.println(planner);
		model.addAttribute("result", regService.plannerReg(planner, request));
		return "planner/plannerReg";
	}
}
