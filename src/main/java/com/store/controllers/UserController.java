package com.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.store.models.User;
import com.store.services.UserService;

import jakarta.annotation.PostConstruct;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void initializeData() {
        userService.initializeUsers();
    }

    @GetMapping("/user")
    public String listUsers(Model model) {
        List<User> users = userService.getAllUser();
        model.addAttribute("listUsers", users);
        return "user";
    }
}
