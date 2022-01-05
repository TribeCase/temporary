package com.ibm.service;

import com.ibm.entity.Appointment;

public interface AppointmentService {
	
	void addAppointment(Appointment app,int patId,int docId);

}
