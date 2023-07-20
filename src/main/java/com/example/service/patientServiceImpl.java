package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Patient;
import com.example.repository.PatientRepository;

@Service
public class patientServiceImpl implements PatientService {
	
	@Autowired
	 PatientRepository patientRepository;

	@Override
	public void savePatient(Patient patient) {
		 patientRepository.save(patient);
	}

	@Override
	public List<Patient> findAll() {		
		return patientRepository.findAll();
	}


	@Override
	public boolean dischargePatient(Long id) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if (optionalPatient.isPresent()) {
            Patient patient = optionalPatient.get();
            patient.setStatus("discharged");
            patientRepository.save(patient);
            return true;
        } else {
            return false;
        }
    }

	@Override
	public Optional<Patient> findByPatientId(long id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id);
	}

}
