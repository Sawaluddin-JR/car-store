package com.store.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.models.Car;

@Service
public class CarService {
    private List<Car> carList = new ArrayList<>();

    public List<Car> getAllCars() {
        return carList;
    }

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public Car getCarById(Integer id) {
        for (Car car : carList) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null; // Mobil dengan ID yang diberikan tidak ditemukan
    }

    public void updateCar(Integer id, Car updatedCar) {
        Car existingCar = getCarById(id);
        if (existingCar != null) {
            existingCar.setMerk(updatedCar.getMerk());
            existingCar.setModel(updatedCar.getModel());
            existingCar.setYear(updatedCar.getYear());
            existingCar.setColor(updatedCar.getColor());
        }
    }

    public void deleteCar(Integer id) {
        carList.removeIf(car -> car.getId().equals(id));
    }
}
