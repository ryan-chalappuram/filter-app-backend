package com.example.project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String Ailment;
    private String SLA;
    private String stage;
    private String status;
    private Integer ApprovedAmt;
    private String Hospital;
    public Patient(){

    }

    public Patient(String name, String ailment, String SLA, String stage, String status, Integer approvedAmt, String hospital) {
        this.id = id;
        this.name = name;
        Ailment = ailment;
        this.SLA = SLA;
        this.stage = stage;
        this.status = status;
        ApprovedAmt = approvedAmt;
        Hospital = hospital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAilment() {
        return Ailment;
    }

    public void setAilment(String ailment) {
        Ailment = ailment;
    }

    public String getSLA() {
        return SLA;
    }

    public void setSLA(String SLA) {
        this.SLA = SLA;
    }

    public String getstage() {
        return stage;
    }

    public void setstage(String stage) {
        stage = stage;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        status = status;
    }

    public long getApprovedAmt() {
        return ApprovedAmt;
    }

    public void setApprovedAmt(Integer approvedAmt) {
        ApprovedAmt = approvedAmt;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String hospital) {
        Hospital = hospital;
    }
}
