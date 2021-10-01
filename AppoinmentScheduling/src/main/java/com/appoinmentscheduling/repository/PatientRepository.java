package com.appoinmentscheduling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appoinmentscheduling.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
