package com.autoparts.general.dao;

import com.autoparts.general.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface CarRepository extends JpaRepository<Car, Integer> {
   /* @Query( value = "INSERT INTO car(brand_id, model_name, body, engine_displacement, date_built) VALUES(?1, ?2, ?3, ?4, ?5) ",
            nativeQuery = true)
    void setCar(int brandId, String modelName, String body, double engineDisplacement, int year);*/



}
