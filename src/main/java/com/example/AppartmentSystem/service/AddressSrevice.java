package com.example.AppartmentSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AppartmentSystem.entity.Address;
import com.example.AppartmentSystem.repository.AddressRepository;

@Service
public class AddressSrevice {
	
	@Autowired
	AddressRepository addressRepository;
	
	public void createAddress(Address address) {
		
		address.setLocation("Channasandra");
		address.setCity("Bangalore");
		
		addressRepository.save(address);
		
	}

}
