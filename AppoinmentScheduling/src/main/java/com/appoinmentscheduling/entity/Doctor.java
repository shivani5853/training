package com.appoinmentscheduling.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Positive
	@Size(min = 2, max = 50)
	private String name;

	@NotNull
	@Positive
	@Size(min = 6, max = 11)
	private long phoneNumber;

	@NotNull
	@Positive
	@Email
	private String email;

	@ManyToOne(fetch = FetchType.EAGER)
	private Patient patient;

	@ManyToMany
	private List<Appointment> appointment;

}
