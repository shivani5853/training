package com.appoinmentscheduling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appoinmentscheduling.entity.Appointment;

@Repository
public interface AppoinmentRepository extends JpaRepository<Appointment,Integer>{

}
