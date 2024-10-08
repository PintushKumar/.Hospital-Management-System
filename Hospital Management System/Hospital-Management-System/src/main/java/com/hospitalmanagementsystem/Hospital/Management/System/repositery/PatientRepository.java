package com.hospitalmanagementsystem.Hospital.Management.System.repositery;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class PatientRepository {
    HashMap <UUID , Patient>patientDB = new HashMap();
    public void registerPatient(Patient obj){
        UUID id = obj.getpId();
        patientDB.put(id , obj);
    }
    public Patient getPatientById(UUID id){
        return patientDB.get(id);
    }

    public void updatePatientAdmitStatusToFalse(UUID id){
        patientDB.get(id).setAdmit(false);
    }

}
