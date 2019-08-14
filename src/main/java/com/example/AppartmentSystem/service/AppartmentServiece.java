package com.example.AppartmentSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AppartmentSystem.entity.Appartment;
import com.example.AppartmentSystem.repository.AddressRepository;
import com.example.AppartmentSystem.repository.AppartmentRepository;

@Service
public class AppartmentServiece {
	
	@Autowired
	AppartmentRepository appartmentRepository;
	
	public void createAppartment(Appartment appartment) {
		
		appartmentRepository.save(appartment);
	}
	

}
