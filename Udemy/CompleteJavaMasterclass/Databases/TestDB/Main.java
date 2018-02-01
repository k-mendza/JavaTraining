package Udemy.CompleteJavaMasterclass.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        // trying to connect to database in specified directory
        // creating table contacts
        // then automatically close connection to DB
        System.out.println("Connecting to Database ...");
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\DB\\testjava.db");
            Statement statement = conn.createStatement()){

            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        // to close connection to DB and statement:
        // statement.close();
        // conn.close();
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
    }
    }
}
