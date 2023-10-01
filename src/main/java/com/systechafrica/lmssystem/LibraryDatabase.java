package com.systechafrica.lmssystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryDatabase {
    private static final String DB_URL = "jdbc:mysql://localhost/library";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static void createTables() {
        try (Connection connection = getConnection();
                Statement statement = connection.createStatement()) {
            // Create tables for books and borrowers if they don't exist
            String createBooksTableSQL = "CREATE TABLE IF NOT EXISTS books (ISBN VARCHAR(20) PRIMARY KEY, title VARCHAR(255))";
            String createBorrowersTableSQL = "CREATE TABLE IF NOT EXISTS borrowers (student_number VARCHAR(20) PRIMARY KEY)";

            statement.executeUpdate(createBooksTableSQL);
            statement.executeUpdate(createBorrowersTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
