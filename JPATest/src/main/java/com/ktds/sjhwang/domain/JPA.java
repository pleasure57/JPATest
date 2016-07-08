package com.ktds.sjhwang.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="JPA") 
public class JPA {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false)
	private int id;

	@Column(name="SUBJECT", nullable=true)
	private String subject;
	
	@Column(name="description", nullable=true)
	private String description;
	
	@OneToMany(mappedBy="jpa")
	@JoinColumn()
	private List<JPA2> jpa2;
	
	public List<JPA2> getJpa2() {
		return jpa2;
	}
	public void setJpa2(List<JPA2> jpa2) {
		this.jpa2 = jpa2;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
