package Udemy.CompleteJavaMasterclass.DB;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // trying to connect to database in specified directory
        // creating table contacts
        // then automatically close connection to DB
        System.out.println("Connecting to Database ...");
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\DB\\testjava.db");
            Statement statement = conn.createStatement()){
            // CREATE IF NOT EXISTS
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                              "(name TEXT, phone INTEGER, email TEXT)");
            // each time the code is executed this record will be added to DB with no errors
            // IF NOT EXISTS doesn't work here!
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                              "VALUES('Kar', 111222333, 'myemail@email.com')");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()){
                System.out.println(results.getString("name") + " " + results.getInt("phone") + " " +
                        results.getString("email"));
            }
        // to close connection to DB and statement:
        // statement.close();
        // conn.close();
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
    }
    }
}
