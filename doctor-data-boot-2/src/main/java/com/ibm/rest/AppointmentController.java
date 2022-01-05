package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Appointment;
import com.ibm.entity.Doctor;
import com.ibm.entity.Patient;
import com.ibm.service.AppointmentService;
import com.ibm.service.DoctorService;
import com.ibm.service.PatientService;

@RestController
public class AppointmentController {

	@Autowired
	private DoctorService docs;
	
	@Autowired
	private PatientService pats;
	
	@Autowired
	private AppointmentService apps;
	
	@PostMapping(value="/get/doc",consumes = "application/json")
	public void addDoc(@RequestBody Doctor doc)
	{
		docs.addDoctor(doc);
	}
	
	@PostMapping(value="/get/pat",consumes = "application/json")
	public void addPat(@RequestBody Patient pat)
	{
		pats.addPatient(pat);
	}
	
	@PostMapping(value="/get/app",consumes="application/json")
	public void addApp(@RequestBody Appointment app, @RequestParam int patId, @RequestParam int docId)
	{
		apps.addAppointment(app,patId,docId);
	}
	
}
