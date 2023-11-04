package com.store.models;

public class CarUser {
    private Car car;
    private User user;

    public CarUser() {

    }

    public CarUser(Car car, User user) {
        this.car = car;
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
