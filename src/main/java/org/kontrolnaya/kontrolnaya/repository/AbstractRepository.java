package org.kontrolnaya.kontrolnaya.repository;

import org.springframework.jdbc.core.RowMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public abstract class AbstractRepository <T>{
    RowMapper<T> mapper;

    abstract List<T> getAll();

    public Optional<Connection> getConnection(){
        return Configuration.getConnection();
    }
    protected PreparedStatement getPreparedStatement(String SQL_QUERY, Optional<Long> id) {
        if (id.isPresent()) {
            return getConnection()
                    .map(connection -> {
                        try {
                            return connection.prepareStatement(SQL_QUERY);
                        } catch (SQLException e) {
                            throw new RuntimeException();
                        }
                    }).orElseThrow(RuntimeException::new);
        }
        return getConnection()
                .map(connection -> {
                    try {
                        return connection.prepareStatement(SQL_QUERY);
                    } catch (SQLException e) {
                        throw new RuntimeException();
                    }
                }).orElseThrow(RuntimeException::new);
    }
}
