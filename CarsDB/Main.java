package com.karmen;

import com.karmen.Model.Car;
import com.karmen.Model.CarsArrayList;

import java.sql.*;
import java.util.ArrayList;

/**
 * It is required to provide sqlite.jar driver for JDBC to be able to read data from DB.
 */

public class Main {
    public static final String DB_NAME = "cars.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\DB\\" + DB_NAME;

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(CONNECTION_STRING)){
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select Brands.BrandName, Models.ModelName, Models.Price from Brands inner join Models ON Brands.BrandID = Models.BrandID");

            ArrayList<Car> carList = new ArrayList<>();
            while(resultSet.next()) {
                //System.out.println(resultSet.getString("BrandName") + " " + resultSet.getString("ModelName") + " " + resultSet.getDouble("Price"));
                carList.add(new Car(resultSet.getString("BrandName"),resultSet.getString("ModelName"),resultSet.getDouble("Price")));
            }
            CarsArrayList carsArrayList = new CarsArrayList(carList);
            carsArrayList.printCarsArrayList();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
