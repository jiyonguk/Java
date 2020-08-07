package com.aia.mm.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mm.dao.MemberDao;

@Service
public class MemberViewService {
	private MemberDao dao;
	
	@Autowired
	SqlSessionTemplate template;
}
