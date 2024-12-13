package org.kontrolnaya.kontrolnaya.repository;

import org.kontrolnaya.kontrolnaya.model.SportsEquipment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class SportsEquipmentRepository extends AbstractRepository<SportsEquipment>{
    private static final String SQL_SAVE = "INSERT INTO sports_equipment (name, parameters, age, accommodationConditions) VALUES (?, ?, ?, ?)";
    private static final String SQL_GET_ALL = "SELECT * FROM sports_equipment";
    private static final String SQL_FIND_BY_ID = "SELECT * FROM sports_equipment WHERE id = ?";
    private static final String SQL_DELETE_BY_ID = "DELETE FROM sports_equipment WHERE id = ?";
    public SportsEquipmentRepository(SportsEquipmentRecordMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    public List<SportsEquipment> getAll() {
        PreparedStatement preparedStatement = getPreparedStatement(SQL_GET_ALL, Optional.empty());
        System.out.println(preparedStatement);
        try {
            System.out.println("Hiiiiiiiiiiiiiiiiiiiiiii");
            ResultSet executedQuery = preparedStatement.executeQuery();
            List<SportsEquipment> sportsEquipment = new ArrayList<>();
            while (executedQuery.next()) {
                sportsEquipment.add(mapper.mapRow(executedQuery, 0));
            }
            return sportsEquipment;
        } catch (SQLException e) {
            throw new RuntimeException("couldn't get all elements sorry :(");
        }
    }

}
