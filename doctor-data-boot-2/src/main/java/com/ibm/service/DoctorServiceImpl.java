package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Doctor;
import com.ibm.repo.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository repo;
	@Override
	public int addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		repo.save(doc);
		return doc.getDocId();
	}
	@Override
	public Doctor findAllDoctor(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
