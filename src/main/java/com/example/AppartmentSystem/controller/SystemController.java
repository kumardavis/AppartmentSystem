package com.example.AppartmentSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AppartmentSystem.entity.Address;
import com.example.AppartmentSystem.service.AddressSrevice;

@RestController
public class SystemController {
	
	@Autowired
	private AddressSrevice addressService;
	@RequestMapping("/")
	public String display() {
		addressService.createAddress(new Address());
		return "hello World";
		
	}

}
