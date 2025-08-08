package jdbc1.employeelist.JDBCconnection;


import JDBC.DatabaseConnection;

import java.sql.*;

public class Conn {
    public Connection connection;

    public Conn() {

        try {
            System.out.println("Starting Database connection");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root", "root");
            System.out.println("Connected to database successfully");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
    }
}