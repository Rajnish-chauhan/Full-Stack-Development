package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    private static final String url="jdbc:mysql://localhost:3306/Garage";
    private static final String user="root";
    private static final String password="root123";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
}
