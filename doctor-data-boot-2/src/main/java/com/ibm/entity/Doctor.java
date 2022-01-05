package com.ibm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Doctor {

	@Id
	@GeneratedValue
	@Column(name="doc_id")
	private int docId;
	@Column(name="doc_name",length=30)
	private String name;
	@Column(length=30)
	private String speciality;
	
	@OneToMany(mappedBy = "doc",cascade = CascadeType.ALL)
	private List<Appointment> app=new ArrayList<Appointment>();

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
