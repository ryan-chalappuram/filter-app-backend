package com.example.project.repository;

import com.example.project.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<Patient,Long> {

    List<Patient> findByStage(String stage);
    List<Patient> findByStatus(String status);
    List<Patient> findByStageAndStatus(String stage, String status);

    List<Patient> findByStageIn(List <String> stages);
}
