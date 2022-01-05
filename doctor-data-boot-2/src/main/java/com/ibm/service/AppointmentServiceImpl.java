package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Appointment;
import com.ibm.repo.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository repo;
	
	@Autowired
	private PatientService serp;
	
	@Autowired
	private DoctorService serd;
	@Override
	public void addAppointment(Appointment app,int patId,int docId) {
		app.setPat(serp.findAllPatient(patId));
		app.setDoc(serd.findAllDoctor(docId));
		repo.save(app);
	}

}
