package com.migos.migos.dao;

import com.migos.migos.model.Nurse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeNurseDataAccessService implements NurseDao{

    private static List<Nurse> DB= new ArrayList<>();
    @Override
    public int insertNurse(UUID id, Nurse nurse) {
        DB.add(new Nurse(id, nurse.getName()));
        return 1;
    }
}
