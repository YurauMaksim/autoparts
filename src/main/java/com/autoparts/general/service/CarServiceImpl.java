package com.autoparts.general.service;

import com.autoparts.general.dao.CarRepository;
import com.autoparts.general.entity.Brand;
import com.autoparts.general.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {


    CarRepository carRepository;
    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /*public void setCar(int brandId, String modelName, String body, double engineDisplacement, int year){
        carRepository.setCar(brandId, modelName, body, engineDisplacement, year);
    }*/

    @Override
    public void saveCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
