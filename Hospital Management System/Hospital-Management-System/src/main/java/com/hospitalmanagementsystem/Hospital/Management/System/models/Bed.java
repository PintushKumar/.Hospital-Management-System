package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.UUID;

public class Bed {
    UUID bedID;
    UUID patient;
    UUID doctor;
    UUID hospitalId;
    boolean isBooked;

    public Bed(UUID bedID, UUID patient, UUID doctor, boolean isBooked , UUID hospitalId) {
        this.bedID = bedID;
        this.patient = patient;
        this.doctor = doctor;
        this.isBooked = isBooked;
        this.hospitalId = hospitalId;
    }

    public Bed() {

    }

    public UUID getBedID() {
        return bedID;
    }

    public UUID getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(UUID hospitalId) {
        this.hospitalId = hospitalId;
    }

    public void setBedID(UUID bedID) {
        this.bedID = bedID;
    }

    public UUID getPatient() {
        return patient;
    }

    public void setPatient(UUID patient) {
        this.patient = patient;
    }

    public UUID getDoctor() {
        return doctor;
    }

    public void setDoctor(UUID doctor) {
        this.doctor = doctor;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
