package com.example.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Patient;
import com.example.service.PatientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
	
	@Autowired
    private  PatientService patientService;
    
   
    
    @PostMapping("/save")
    public ResponseEntity<Void> admitPatient(@Valid @RequestBody Patient patient) {
        patientService.savePatient(patient);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @GetMapping("/getAll")
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients = patientService.findAll();
        return ResponseEntity.ok(patients);
    }
    
    @GetMapping("get/{id}")
    public Optional<Patient> findByPatientId(@PathVariable Long id){
    	return patientService.findByPatientId(id);
    }
 
    @PostMapping("/{id}/discharge")
    public ResponseEntity<String> dischargePatient(@PathVariable Long id) {
        boolean discharged = patientService.dischargePatient(id);
        if (discharged) {
            return ResponseEntity.ok("Patient discharged");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
