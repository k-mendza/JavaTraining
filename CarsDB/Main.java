package com.karmen;

import java.sql.*;

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
            while(resultSet.next()) {
                System.out.println(resultSet.getString("BrandName") + " " + resultSet.getString("ModelName") + " " + resultSet.getDouble("Price"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
