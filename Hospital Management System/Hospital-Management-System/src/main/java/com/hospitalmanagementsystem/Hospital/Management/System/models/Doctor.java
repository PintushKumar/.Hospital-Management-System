package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Doctor {
    UUID docId;
    String name;
    String degree;
    List<Patient>patients;
    UUID hospitalID;

    public Doctor(UUID docId, String name, String degree, List<Patient> patients, UUID hospitalID) {
        this.docId = docId;
        this.name = name;
        this.degree = degree;
        this.patients = new ArrayList<>();
        this.hospitalID = hospitalID;
    }

    public UUID getDocId() {
        return docId;
    }

    public void setDocId(UUID docId) {
        this.docId = docId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public UUID getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(UUID hospitalID) {
        this.hospitalID = hospitalID;
    }


}
