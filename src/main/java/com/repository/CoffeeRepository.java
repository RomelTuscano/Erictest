package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Coffee;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

	
}
