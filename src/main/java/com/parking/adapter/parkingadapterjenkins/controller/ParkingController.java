package com.parking.adapter.parkingadapterjenkins.controller;

import com.parking.adapter.parkingadapterjenkins.model.Car;
import com.parking.adapter.parkingadapterjenkins.service.Operations;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ParkingController {

    private final Operations operations;

    @PostMapping
    public ResponseEntity<?> addCar(@RequestBody Car car){
         Long id=operations.addCar(car);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
