package com.ibm.service;

import com.ibm.entity.Doctor;

public interface DoctorService {

	int addDoctor(Doctor doc);
	
	Doctor findAllDoctor(int id);
}
