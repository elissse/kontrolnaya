package org.kontrolnaya.kontrolnaya.repository;

import org.kontrolnaya.kontrolnaya.model.SportsEquipment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SportsEquipmentRecordMapper implements RowMapper<SportsEquipment> {
    @Override
    public SportsEquipment mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new SportsEquipment(rs.getString("name"), rs.getString("parameters"), rs.getString("age"), rs.getString("accommodationConditions"));
    }
}