package com.aia.rest.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aia.rest.model.Member;

@RestController
@RequestMapping("/rest/v1")
public class RestTestController {
	
	@RequestMapping("/memberMap")
	public Map<Integer, Member> getMap(){
		
		Map<Integer, Member> map = new HashMap<Integer, Member>();
		
		
		map.put(1, new Member(1, "cool1", "cool1Gafsda", "fwafaw", new Date()));
		map.put(2, new Member(2, "1", "5", "fwafaw", new Date()));
		map.put(3, new Member(3, "2", "6", "fwafaw", new Date()));
		map.put(4, new Member(4, "3", "7", "fwafaw", new Date()));
		map.put(5, new Member(5, "4", "5", "fwafaw", new Date()));
		
		return map;
	}	
	
	@RequestMapping("/memberList")
	public List<Member> getList(){
		
		List<Member> list = new ArrayList<Member>();
		list.add(new Member(1, "cool1", "cool1Gafsda", "fwafaw", new Date()));
		list.add(new Member(2, "1", "5", "fwafaw", new Date()));
		list.add(new Member(3, "2", "6", "fwafaw", new Date()));
		list.add(new Member(4, "3", "7", "fwafaw", new Date()));
		list.add(new Member(5, "4", "5", "fwafaw", new Date()));
		
		return list;
	}
	@GetMapping
	//@RequestMapping(method = RequestMethod.GET)
	public Member getMember() {
		Member member = new Member();
		member.setId(1);
		member.setName("Cool");
		member.setEmail("cool@gmail");
		member.setPhoto("default.png");
		
		return member;
	}
	@RequestMapping("/text")
	public String testString() {
		return "Hello~ RestFul";
	}
}
