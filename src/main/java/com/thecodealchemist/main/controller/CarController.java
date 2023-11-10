package com.thecodealchemist.main.controller;

import com.thecodealchemist.main.entity.Car;
import com.thecodealchemist.main.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody Car car) {
        Car savedCar = carRepository.save(car);
        return ResponseEntity.ok("Car {"+savedCar.getId()+"} created successfully");
    }
}
