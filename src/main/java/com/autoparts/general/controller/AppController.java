package com.autoparts.general.controller;

import com.autoparts.general.entity.Brand;
import com.autoparts.general.entity.Car;
import com.autoparts.general.entity.User;
import com.autoparts.general.service.BrandService;
import com.autoparts.general.service.BrandServiceImpl;
import com.autoparts.general.service.CarService;
import com.autoparts.general.service.UserService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AppController {

    private UserService userService;
    private BrandService brandService;
    private CarService carService;

    public AppController(UserService userService, BrandService brandService, CarService carService) {
        this.userService = userService;
        this.brandService = brandService;
        this.carService = carService;
    }

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }

    @GetMapping("/login_form")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login-form";
    }

    @GetMapping("/choose_car")
    public String showChooseCarForm(Model model){
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        model.addAttribute("car", new Car());
        List<Brand> brands = brandService.getAllBrands();
        model.addAttribute("brands", brands);
        model.addAttribute("brand", new Brand());
        return "choose-car-form";
    }
}
