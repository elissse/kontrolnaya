package org.kontrolnaya.kontrolnaya.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;


public class Configuration {

    public static Optional<Connection> getConnection() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("D:\\IdeaProjects\\kontrolnaya\\src\\main\\resources\\db.properties"));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        try {
            Class.forName("org.postgresql.Driver");
            return Optional.ofNullable(DriverManager.getConnection(properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")));
        } catch (SQLException | ClassNotFoundException e) {
            return Optional.empty();
        }
    }

}
