package com.appoinmentscheduling.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specialization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String specialization_Area;
	private int specialization_age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization_Area() {
		return specialization_Area;
	}
	public void setSpecialization_Area(String specialization_Area) {
		this.specialization_Area = specialization_Area;
	}
	public int getSpecialization_age() {
		return specialization_age;
	}
	public void setSpecialization_age(int specialization_age) {
		this.specialization_age = specialization_age;
	}
	public Specialization(int id, String name, String specialization_Area, int specialization_age) {
		super();
		this.id = id;
		this.name = name;
		this.specialization_Area = specialization_Area;
		this.specialization_age = specialization_age;
	}
	@Override
	public String toString() {
		return "Specialization [id=" + id + ", name=" + name + ", specialization_Area=" + specialization_Area
				+ ", specialization_age=" + specialization_age + "]";
	}
	public Specialization() {
		super();
	}
	
	
}
