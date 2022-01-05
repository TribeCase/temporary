package com.ibm.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToOne;



@Entity
public class Patient {

	@Id
	@GeneratedValue
	@Column(name="pat_id")
	private int patId;
	@Column(name="pat_name",length=30)
	private String name;
	
	@OneToOne(mappedBy = "pat",cascade = CascadeType.ALL)
	private Appointment app;

	public int getPatId() {
		return patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
