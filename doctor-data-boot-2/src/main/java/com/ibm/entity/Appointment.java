package com.ibm.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appointment {

	@Id
	@GeneratedValue
	@Column(name = "app_id")
	private int appId;
	@Column(length = 40)
	private String reason;
	@Column(name = "app_date")
	private LocalDate appDate;

	//my edit edit by apoorva
	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}

	public Patient getPat() {
		return pat;
	}

	public void setPat(Patient pat) {
		this.pat = pat;
	}

	@Column(name = "app_time")
	private LocalTime appTime;

	@ManyToOne
	@JoinColumn(name = "doc_id")
	private Doctor doc;

	@OneToOne
	@JoinColumn(name = "pat_id")
	private Patient pat;

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDate getAppDate() {
		return appDate;
	}

	public void setAppDate(LocalDate appDate) {
		this.appDate = appDate;
	}

	public LocalTime getAppTime() {
		return appTime;
	}

	public void setAppTime(LocalTime appTime) {
		this.appTime = appTime;
	}

}
