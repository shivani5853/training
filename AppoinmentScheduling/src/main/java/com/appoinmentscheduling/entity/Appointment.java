package com.appoinmentscheduling.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Date appointment_Date_time;

	private int starter;

	private int end;

	private String reson;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAppointment_Date_time() {
		return appointment_Date_time;
	}

	public void setAppointment_Date_time(Date appointment_Date_time) {
		this.appointment_Date_time = appointment_Date_time;
	}

	public int getStarter() {
		return starter;
	}

	public void setStarter(int starter) {
		this.starter = starter;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getReson() {
		return reson;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}

	public Appointment(int id, Date appointment_Date_time, int starter, int end, String reson, Patient patient,
			Doctor doctor) {
		super();
		this.id = id;
		this.appointment_Date_time = appointment_Date_time;
		this.starter = starter;
		this.end = end;
		this.reson = reson;
		this.patient = patient;
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointment_Date_time=" + appointment_Date_time + ", starter=" + starter
				+ ", end=" + end + ", reson=" + reson + ", patient=" + patient + ", doctor=" + doctor + "]";
	}

	public Appointment() {
		super();
	}

	@ManyToOne
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@ManyToOne
	private Doctor doctor;
	
	
}
