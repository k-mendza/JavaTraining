package com.karmen.Model;

import java.util.ArrayList;

public class CarsArrayList {
    private ArrayList<Car> carsArrayList;

    public CarsArrayList(ArrayList<Car> carsArrayList) {
        this.carsArrayList = carsArrayList;
    }

    public ArrayList<Car> getCarsArrayList() {
        return carsArrayList;
    }

    public void setCarsArrayList(ArrayList<Car> carsArrayList) {
        this.carsArrayList = carsArrayList;
    }

    public void printCarsArrayList(){
        for (Car car : this.carsArrayList){
            System.out.println(car);
        }
    }
}
