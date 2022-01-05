package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Patient;
import com.ibm.repo.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repo;
	@Override
	public int addPatient(Patient pat) {
		repo.save(pat);
		return pat.getPatId();
	}
	@Override
	public Patient findAllPatient(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
