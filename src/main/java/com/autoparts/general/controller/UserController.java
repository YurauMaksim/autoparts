package com.autoparts.general.controller;


import com.autoparts.general.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private List<User> users;

    @PostConstruct
    private void loadData(){
        User user = new User();
        users = new ArrayList<>();
        users.add(user);

    }

    @GetMapping("/list")
    public String listUsers(Model model){
        model.addAttribute("users", users);
        return "list-users";
    }

}
