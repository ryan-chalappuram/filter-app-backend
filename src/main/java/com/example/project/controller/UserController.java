package com.example.project.controller;

import com.example.project.model.Patient;
import com.example.project.repository.UserRepository;
import com.example.project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
    @Autowired
    private PatientService patientService;
//    @Autowired
//    private UserRepository userRepository;

//    @GetMapping("patients")
//    public List<Patient> getPatients(){
//        return this.userRepository.findAll();
//    }
    @GetMapping("patients")
    public Object getPatients(@RequestParam(required = false) String stage) {
        if (stage != null ) {
        return  this.patientService.getPatientByStage(stage);

        } else {
            return this.patientService.getAllPatients();
        }
    }
    @GetMapping("test1")
    public Object getPatientsbystatus(@RequestParam(required = false) String status) {
        if (status != null ) {
            return  this.patientService.getPatientByStatus(status);

        } else {
            return this.patientService.getAllPatients();
        }
    }
    @GetMapping("test")
    public ResponseEntity<List<Patient>> getpatientsByStageAndStatus(@RequestParam String stage,
                                                                 @RequestParam String status) {
        return new ResponseEntity<List<Patient>>(patientService.findByStageAndStatus(stage, status), HttpStatus.OK);
    }


    @GetMapping("{id}")
    public Optional<Patient> fetchbyid(@PathVariable Long id){
        return patientService.SearchbyId(id);
    }


}
