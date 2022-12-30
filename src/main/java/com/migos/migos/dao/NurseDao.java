package com.migos.migos.dao;

import com.migos.migos.model.Nurse;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NurseDao {

    int insertNurse(UUID id, Nurse nurse);

    default int insertNurse(Nurse nurse){
        UUID id = UUID.randomUUID();
        return insertNurse(id, nurse);
    }

    List<Nurse> selectAllNurses();

    Optional<Nurse> selectNurseById(UUID id);

    int deleteNurseById(UUID id);

    int updateNurseById(UUID id, Nurse nurse);
}
