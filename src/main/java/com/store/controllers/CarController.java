package com.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.store.models.Car;
import com.store.services.CarService;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/car")
    public String listCar(Model model) {
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        return "car";
    }

    @GetMapping("/add")
    public String addCar(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);
        return "add-car";
    }

    @PostMapping("/add-save")
    public String saveCar(Car car) {
        carService.addCar(car);
        return "redirect:/car";
    }

    @GetMapping("/edit/{id}")
    public String editCar(@PathVariable Integer id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "edit-car";
    }

    @PostMapping("/update/{id}")
    public String updateCar(@PathVariable Integer id, Car updatedCar) {
        carService.updateCar(id, updatedCar);
        return "redirect:/car";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);
        return "redirect:/car";
    }

}
