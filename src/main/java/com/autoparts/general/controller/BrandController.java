package com.autoparts.general.controller;

import com.autoparts.general.entity.Brand;
import com.autoparts.general.entity.Car;
import com.autoparts.general.enums.Body;
import com.autoparts.general.service.BrandServiceImpl;
import com.autoparts.general.service.CarService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

@Controller
@RequestMapping("/brand")
public class BrandController {
    CarService carService;
    BrandServiceImpl brandServiceImpl;

    @Autowired
    public BrandController(CarService carService, BrandServiceImpl brandServiceImpl) {
        this.carService = carService;
        this.brandServiceImpl = brandServiceImpl;
    }

    @GetMapping("/downloadAll")
    public String downloadCars(){
        String url = "src/main/resources/static/json/cars.json";
        String json = null;
        Integer brandId;
        try {
            json = new String((Files.readAllBytes(Paths.get(url))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JSONArray jsonArray = new JSONArray(json);

        //jsonArray.length()
        for (int i = 0; i < jsonArray.length(); i++)
        {
            String carName = jsonArray.getJSONObject(i).getString("id");
            Brand brand = new Brand(carName);
            brandServiceImpl.saveBrand(brand);
            brandId = brandServiceImpl.getIdByName(carName);


            JSONArray models = jsonArray.getJSONObject(i).getJSONArray("models");

            //models.length()
            for (int j = 0; j < models.length(); j++){
                String modelName = models.getJSONObject(j).getString("id");



                String body = Body.getRandomBody().name();

                Random random = new Random();
                double range = 2.8 - 0.8;
                double scaled = random.nextDouble() * range;
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                decimalFormat.setRoundingMode(RoundingMode.CEILING);
                DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
                dfs.setDecimalSeparator('.');
                decimalFormat.setDecimalFormatSymbols(dfs);
                scaled = scaled + 0.8;


                scaled = Double.parseDouble(decimalFormat.format(scaled));

                double engineDispracement = scaled;
                int year = models.getJSONObject(j).getInt("year-from");

                Car car = new Car(new Brand(brandId, carName), modelName, Body.valueOf(body), engineDispracement, year);
                carService.saveCar(car);
                System.out.println(carName + " " + modelName + " " +  body  + " " +  engineDispracement + " " +  year);






            }


        }


        return "everything is ok";
    }
}
