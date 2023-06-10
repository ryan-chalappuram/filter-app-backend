package com.example.project.service;

import com.example.project.model.Patient;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
     private UserRepository userRepository;

    public List<Patient> getAllPatients() {
        return userRepository.findAll();

    }

    public List<Patient> getPatientByStage(String stage) {
       return userRepository.findByStage(stage);

    }
    public List<Patient> findByStageIn(List<String> stages )
    {
        return userRepository.findByStageIn(stages);
    }


    public Optional<Patient> SearchbyId(Long id){
        return userRepository.findById(id);
    }

    public List<Patient> findByStageAndStatus(String stage, String status) {
        return userRepository.findByStageAndStatus(stage,status);
    }

    public Object getPatientByStatus(String status) {
        return userRepository.findByStatus(status);
    }
}

