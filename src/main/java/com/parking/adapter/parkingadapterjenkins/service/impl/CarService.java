package com.parking.adapter.parkingadapterjenkins.service.impl;

import com.parking.adapter.parkingadapterjenkins.model.Car;
import com.parking.adapter.parkingadapterjenkins.repository.DatabaseOperations;
import com.parking.adapter.parkingadapterjenkins.service.Operations;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService implements Operations {

  //  private final DatabaseOperations databaseOperations;

    @Override
    public Long addCar(Car car) {

     //   CarEntity carEntity = new CarEntity();
        return null;
    }
}
