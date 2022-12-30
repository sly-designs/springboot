package com.migos.migos.dao;

import com.migos.migos.model.Nurse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeNurseDataAccessService implements NurseDao{

    private static List<Nurse> DB= new ArrayList<>();
    @Override
    public int insertNurse(UUID id, Nurse nurse) {
        DB.add(new Nurse(id, nurse.getName()));
        return 1;
    }

    @Override
    public List<Nurse> selectAllNurses() {
        return DB;
    }

    @Override
    public Optional<Nurse> selectNurseById(UUID id) {
        return DB.stream()
                .filter(nurse -> nurse.getId().equals(id))
                .findFirst();
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
