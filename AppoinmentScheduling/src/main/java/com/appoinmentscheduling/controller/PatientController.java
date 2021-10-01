package com.appoinmentscheduling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.appoinmentscheduling.entity.Patient;
import com.appoinmentscheduling.service.PatientService;

@RestController
@RequestMapping("/Patient")
public class PatientController {

	@Autowired
	PatientService patientService;

	@GetMapping("/all")
	public List<Patient> getPatient() {
		List<Patient> list = patientService.getPatientDetails();
		System.out.println(list.get(0).toString());
		return patientService.getPatientDetails();
	}

	@GetMapping("/{patientId}")
	public Patient getPatientById(@PathVariable("patientId") int id) {
		return patientService.getPatientDetailsById(id);
	}

	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.OK)
	public Patient savePatient(@RequestBody Patient patient) {
		return patientService.savePatientDetails(patient);
	}

	@DeleteMapping("/{patientId}")
	public Patient deletePatient(@PathVariable("patientId") int id) {
		return patientService.removePatient(id);
	}

}
