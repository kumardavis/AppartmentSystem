package com.example.AppartmentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AppartmentSystem.entity.Flat;

public interface FlatRepository extends JpaRepository<Flat, Long> {

}
