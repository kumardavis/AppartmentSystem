package com.example.AppartmentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AppartmentSystem.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
