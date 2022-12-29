package com.migos.migos.dao;

import com.migos.migos.model.Nurse;

import java.util.UUID;

public interface NurseDao {

    int insertNurse(UUID id, Nurse nurse);

    default int insertNurse(Nurse nurse){
        UUID id = UUID.randomUUID();
        return insertNurse(id, nurse);
    }
}
