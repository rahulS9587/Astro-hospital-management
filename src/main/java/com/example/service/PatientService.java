package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Patient;

public interface PatientService {
	
	public void savePatient(Patient patient);
	
	public boolean dischargePatient(Long id);
	public List<Patient> findAll();
	
	public Optional<Patient> findByPatientId(long id);
	
//	public void dischargePatientById(long id);
		


}
