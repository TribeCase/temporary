package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
