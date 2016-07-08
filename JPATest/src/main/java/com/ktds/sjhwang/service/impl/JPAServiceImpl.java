package com.ktds.sjhwang.service.impl;

import com.ktds.sjhwang.biz.JPABiz;
import com.ktds.sjhwang.domain.JPA;
import com.ktds.sjhwang.service.JPAService;

public class JPAServiceImpl implements JPAService {

	private JPABiz jpaBiz;
	
	public void setJpaBiz(JPABiz jpaBiz) {
		this.jpaBiz = jpaBiz;
	}

	@Override
	public void insertData() {
		JPA jpa = jpaBiz.insertData();
		
		jpa.setSubject("수정합니다");
		jpaBiz.updateData(jpa);
	}

	
}
