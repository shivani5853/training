package com.appoinmentscheduling.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appoinmentscheduling.entity.Patient;
import com.appoinmentscheduling.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;

	public Patient savePatientDetails(Patient patient) {
		return patientRepository.save(patient);
	}

	public Patient getPatientDetailsById(int id) {
		Optional<Patient> patient = patientRepository.findById(id);

		if (patient.isPresent()) {
			return patient.get();
		}
		return null;
	}

	public List<Patient> getPatientDetails() {
		return patientRepository.findAll();
	}

	public Patient removePatient(int id) {
		Optional<Patient> patient = patientRepository.findById(id);

		if (patient.isPresent()) {
			Patient p = patient.get();
			patientRepository.delete(p);
			return p;
		}
		return null;
	}
	
	
}
