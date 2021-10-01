package com.appoinmentscheduling.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Positive
	@Size(min =2 , max=50)
	private String name;

	@NotNull
	@Positive
	@Size(min =2)
	private String age;

	@NotNull
	@Positive
	@Email
	private String email;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Doctor> doctor;
	
	@ManyToMany
	private List<Appointment> appointment;

}
