package com.appoinmentscheduling.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appoinmentscheduling.entity.Appointment;
import com.appoinmentscheduling.entity.Doctor;
import com.appoinmentscheduling.repository.AppoinmentRepository;
import com.appoinmentscheduling.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	private AppoinmentRepository appoinmentRepository;

	public Doctor saveDoctorDetails(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	public Doctor getDoctorDetailsByID(int id) {
		Optional<Doctor> doctor = doctorRepository.findById(id);

		if (doctor.isPresent()) {
			return doctor.get();
		}
		return null;
	}

	public List<Doctor> getDoctorDetails() {
		return doctorRepository.findAll();
	}

	public Doctor removeDoctor(int id) {
		Optional<Doctor> doctor = doctorRepository.findById(id);

		if (doctor.isPresent()) {
			Doctor d = doctor.get();
			doctorRepository.delete(d);
			return d;
		}
		return null;
	}

	public Appointment approveAppointment(Appointment appointment) {
		System.out.println("approving Appointment");
		return appoinmentRepository.save(appointment);
	}
	
}
