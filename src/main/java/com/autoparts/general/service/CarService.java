package com.autoparts.general.service;

import com.autoparts.general.entity.Brand;
import com.autoparts.general.entity.Car;

import java.time.LocalDate;
import java.util.List;

public interface CarService {
    void saveCar (Car car);

    List<Car> getAllCars();
}
