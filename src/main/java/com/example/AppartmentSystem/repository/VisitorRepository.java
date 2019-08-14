package com.example.AppartmentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AppartmentSystem.entity.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {

}
