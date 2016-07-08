package com.ktds.sjhwang.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="JPA2")
public class JPA2 {

	@Id
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="JPA_ID", updatable=true, insertable=true)
	private int jpa_id;
	
	@Column(name="MEMO", nullable=false)
	private String memo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJpa_id() {
		return jpa_id;
	}
	public void setJpa_id(int jpa_id) {
		this.jpa_id = jpa_id;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
}
