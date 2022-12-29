package com.migos.migos.service;

import com.migos.migos.dao.NurseDao;
import com.migos.migos.model.Nurse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
}
