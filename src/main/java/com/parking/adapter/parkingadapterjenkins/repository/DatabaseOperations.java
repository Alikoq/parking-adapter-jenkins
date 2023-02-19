package com.parking.adapter.parkingadapterjenkins.repository;

import com.parking.adapter.parkingadapterjenkins.entity.CarEntity;
import com.parking.adapter.parkingadapterjenkins.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseOperations extends JpaRepository<CarEntity, Car> {



}
