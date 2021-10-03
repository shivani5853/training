package com.appoinmentscheduling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appoinmentscheduling.repository.AppoinmentRepository;

@Service
public class AppoinmentService{
	
	@Autowired
	private AppoinmentRepository aRepo;
}
