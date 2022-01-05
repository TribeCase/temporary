package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
