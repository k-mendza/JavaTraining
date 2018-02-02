package Udemy.CompleteJavaMasterclass.DB;

import java.sql.*;

public class Main {
    // to protect against injection attacks use static final constants
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\DB\\testjava.db";
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        // trying to connect to database in specified directory
        // creating table contacts
        // then automatically close connection to DB
        System.out.println("Connecting to Database ...");
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\DB\\testjava.db");
            Statement statement = conn.createStatement()){
            // DROP TABLE IF EXISTS
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            // CREATE IF NOT EXISTS
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                              " (" + COLUMN_NAME + " text, " + COLUMN_PHONE + " integer, "
                              + COLUMN_EMAIL + " text)");

            // each time the code is executed this record will be added to DB with no errors
            // IF NOT EXISTS doesn't work here!
            insertContact(statement , "Kar", 111222333, "myemail@email.com");
            insertContact(statement , "Rad", 222333444, "rademail@email.com");
            insertContact(statement , "Zbs", 333444555, "zbsemail@email.com");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " + results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }
        // to close connection to DB and statement:
        // statement.close();
        // conn.close();
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
    }
    }
    // method to insert records into database
    public static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME +
                ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ")" +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
