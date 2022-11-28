package com.autoparts.general.controller;

import com.autoparts.general.entity.User;
import com.autoparts.general.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    private UserService userService;


    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }



    @GetMapping("/login_form")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login-form";
    }
}
