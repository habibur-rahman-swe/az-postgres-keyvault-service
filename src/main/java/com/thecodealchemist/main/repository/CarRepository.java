package com.thecodealchemist.main.repository;

import com.thecodealchemist.main.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	
}
