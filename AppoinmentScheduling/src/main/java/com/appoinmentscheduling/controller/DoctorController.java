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

import com.appoinmentscheduling.entity.Doctor;
import com.appoinmentscheduling.service.DoctorService;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {

	@Autowired
	public DoctorService doctorService;

	@GetMapping("/all")
	public List<Doctor> getDoctors() {
		return doctorService.getDoctorDetails();
	}

	@GetMapping("/{docId}")
	public Doctor getDoctorById(@PathVariable("docId") int id) {
		return doctorService.getDoctorDetailsByID(id);
	}

	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.OK)
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctorDetails(doctor);
	}

	@DeleteMapping("/{docId}")
	public Doctor deleteDctor(@PathVariable("docId") int id) {
		return doctorService.removeDoctor(id);
	}

}
