package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	//public void dischargePatientById(long id);

	

}
