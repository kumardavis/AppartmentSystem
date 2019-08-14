package com.example.AppartmentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AppartmentSystem.entity.Appartment;

public interface AppartmentRepository extends JpaRepository<Appartment, Long> {

}
