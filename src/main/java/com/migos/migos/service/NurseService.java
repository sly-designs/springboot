package com.migos.migos.service;

import com.migos.migos.dao.NurseDao;
import com.migos.migos.model.Nurse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NurseService {

    private final NurseDao nurseDao;

    @Autowired
    public NurseService(@Qualifier("fakeDao") NurseDao nurseDao) {
        this.nurseDao = nurseDao;
    }

    public int addNurse(Nurse nurse){
        return nurseDao.insertNurse(nurse);
    }

    public List<Nurse> getAllNurses(){
        return nurseDao.selectAllNurses();
    }
    public Optional<Nurse> getNurseById(UUID id) {
        return nurseDao.selectNurseById(id);
    }
    public int deleteNurse(UUID id) {
        return nurseDao.deleteNurseById(id);
    }
    public int updateNurse(UUID id, Nurse newNurse) {
        return nurseDao.updateNurseById(id, newNurse);
    }
}
