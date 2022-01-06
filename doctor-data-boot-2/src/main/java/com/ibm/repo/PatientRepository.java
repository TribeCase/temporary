package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ibm.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{
	
	//@Query(value="update patient set pat_name=:name where pat_id=:pid" , nativeQuery = true)
	//void updatePat(@Param("pid") int patId,@Param("name") String name);

}
