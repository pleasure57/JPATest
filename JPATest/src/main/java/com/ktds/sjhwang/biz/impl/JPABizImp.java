package com.ktds.sjhwang.biz.impl;

import java.util.ArrayList;
import java.util.List;

import com.ktds.sjhwang.biz.JPABiz;
import com.ktds.sjhwang.domain.JPA;
import com.ktds.sjhwang.domain.JPA2;
import com.ktds.sjhwang.repository.JPARepository;



public class JPABizImp implements JPABiz {

	private JPARepository jpaRepository;
	
	public void setJpaRepository(JPARepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	@Override
	public JPA insertData() {
		JPA jpa = new JPA();
		jpa.setSubject("JPA 실험");
		jpa.setDescription("해볼거다");
		
		JPA2 jpa2 = new JPA2();
		jpa2.setMemo("반갑다");
		
		List<JPA2> jpa2List =  new ArrayList<JPA2>();
		jpa2List.add(jpa2);
		
		jpa.setJpa2(jpa2List);
		
		jpaRepository.save(jpa);
		
		System.out.println(jpa.getSubject());
		System.out.println(jpa.getDescription());
		System.out.println(jpa.getId());
		
		return jpa;
	}

	@Override
	public JPA updateData(JPA jpa) {
		
		jpaRepository.save(jpa);
		
		System.out.println(jpa.getSubject());
		System.out.println(jpa.getDescription());
		System.out.println(jpa.getId());
		
		return jpa;
	}

}
