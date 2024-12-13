package org.kontrolnaya.kontrolnaya.service;

import org.kontrolnaya.kontrolnaya.model.SportsEquipment;
import org.kontrolnaya.kontrolnaya.repository.SportsEquipmentRecordMapper;
import org.kontrolnaya.kontrolnaya.repository.SportsEquipmentRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SportsEquipmentService {
    private static SportsEquipmentRecordMapper getSportsEquipmentRecordMapper() {
        return new SportsEquipmentRecordMapper();
    }

    private final SportsEquipmentRepository sportsEquipmentRepository = new SportsEquipmentRepository(getSportsEquipmentRecordMapper());

    public List<SportsEquipment> getAll() {
        return sportsEquipmentRepository.getAll();
    }

}
