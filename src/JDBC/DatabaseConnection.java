package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection connection;
    public DatabaseConnection() {

        try{
            System.out.println("Starting Database connection");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            System.out.println("Connected to database successfully");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
    }
}
