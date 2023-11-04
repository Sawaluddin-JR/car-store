package com.store.models;

public class Car {
    private Integer id;
    private String merk;
    private String model;
    private Integer year;
    private String color;

    public Car() {

    }

    public Car(Integer id, String merk, String model, Integer year, String color) {
        this.id = id;
        this.merk = merk;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
