package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
