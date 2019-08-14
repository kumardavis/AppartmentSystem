package com.example.AppartmentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AppartmentSystem.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
