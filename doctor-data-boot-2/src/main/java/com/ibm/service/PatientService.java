package com.ibm.service;

import com.ibm.entity.Patient;

public interface PatientService {

	int addPatient(Patient pat);
	
	Patient findAllPatient(int id);
}
