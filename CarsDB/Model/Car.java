package com.karmen.Model;

public class Car {
    private String brand;
    private String name;
    private double price;

    public Car(String brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
