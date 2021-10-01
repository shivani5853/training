package com.appoinmentscheduling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appoinmentscheduling.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
