package com.parking.adapter.parkingadapterjenkins.controller;

import com.parking.adapter.parkingadapterjenkins.model.Car;
import com.parking.adapter.parkingadapterjenkins.service.Operations;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/car")
public class ParkingController {

    private final Operations operations;

    @PostMapping(value = "/add")
    public ResponseEntity<?> addCar(@RequestBody Car car){
         Long id=operations.addCar(car);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping(value = "/cars")
    public ResponseEntity<?> getCars() {
        Car car = Car.builder().model("BMW").color("black").year(2022).build();
        Car car2 = Car.builder().model("Mercedes").color("white").year(2022).build();
        Car car3 = Car.builder().model("Haval").color("white").year(2022).build();
        Car car4 = Car.builder().model("Lamborghini").color("black").year(2025).build();
        var cars = List.of(car, car2, car3, car4);
        Long id = operations.addCar(car);
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @GetMapping(value = "/fail")
    public ResponseEntity<?> fail(){
        System.exit(1);
        return new ResponseEntity<>("500", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
