package com.parking.adapter.parkingadapterjenkins.entity;

import com.parking.adapter.parkingadapterjenkins.model.Car;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private Integer year;
    private String color;

    public static CarEntity of(Car car){
      return  CarEntity.builder()
            .color(car.getColor())
            .year(car.getYear())
            .model(car.getModel())
            .build();
    }

}
