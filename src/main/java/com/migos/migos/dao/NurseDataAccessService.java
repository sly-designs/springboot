package com.migos.migos.dao;

import com.migos.migos.model.Nurse;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class NurseDataAccessService implements NurseDao{
    @Override
    public int insertNurse(UUID id, Nurse nurse) {
        return 0;
    }

    @Override
    public List<Nurse> selectAllNurses() {
        return List.of(new Nurse(UUID.randomUUID(), "FROM POSTGRES DB"));
    }

    @Override
    public Optional<Nurse> selectNurseById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteNurseById(UUID id) {
        return 0;
    }

    @Override
    public int updateNurseById(UUID id, Nurse nurse) {
        return 0;
    }
}
