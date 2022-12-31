package com.migos.migos.api;

import com.migos.migos.model.Nurse;
import com.migos.migos.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/nurse")
@RestController
public class NurseController {

    private final NurseService nurseService;

    @Autowired
    public NurseController(NurseService nurseService) {
        this.nurseService = nurseService;
    }

    @PostMapping
    public void addNurse(@RequestBody Nurse nurse){
        nurseService.addNurse(nurse);
    }
    @GetMapping
    public List<Nurse> getAllNurses(){
        return nurseService.getAllNurses();
    }

    @GetMapping(path = "{id}")
    public Nurse getNurseById(@PathVariable("id") UUID id) {
        return nurseService.getNurseById(id)
                .orElse(null);
    }
    @DeleteMapping(path = "{id}")
    public void deleteNurseById(@PathVariable("id") UUID id) {
        nurseService.deleteNurse(id);
    }

    @PutMapping(path = "{id}")
    public void updateNurse(@PathVariable("id") UUID id, @RequestBody Nurse nurseToUpdate) {
        nurseService.updateNurse(id, nurseToUpdate);
    }
}
