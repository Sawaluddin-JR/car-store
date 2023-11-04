package com.store.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.store.models.Car;
import com.store.models.CarUser;
import com.store.models.User;
import com.store.services.CarService;
import com.store.services.UserService;

@Controller
public class CarUserController {
    @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String home(Model model) {

        List<Car> cars = carService.getAllCars();
        List<User> users = userService.getAllUser();

        List<CarUser> carUser = new ArrayList<>();

        for (Car car : cars) {
            for (User user : users) {
                if (car.getId() == user.getId()) {
                    carUser.add(new CarUser(car, user));
                }
            }
        }
        model.addAttribute("carUser", carUser);
        return "index";
    }
}
