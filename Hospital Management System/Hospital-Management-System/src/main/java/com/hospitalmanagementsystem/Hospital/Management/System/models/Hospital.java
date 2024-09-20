package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Hospital {
    UUID hospitalID;
    String name;
    List<Bed> beds;
    List<Doctor> doctor;
    List<Patient> patient;
    Long contactNumber;
    String email;

    public Hospital(UUID hospitalID, String name, List<Bed> beds, List<Doctor> doctor, List<Patient> patient, Long contactNumber, String email) {
        this.hospitalID = hospitalID;
        this.name = name;
        this.beds = new ArrayList<>();
        this.doctor = new ArrayList<>();
        this.patient = new ArrayList<>();
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public UUID getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(UUID hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bed> getBeds() {
        return beds;
    }

    public void setBeds(List<Bed> beds) {
        this.beds = beds;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
