package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.repositery.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HospitalService {
    @Autowired
    HospitalRepository hospitalRepository;


    public List<Hospital> getAllHospital(){
        return hospitalRepository.getAllHospital();
    }

    public void registerHospital(Hospital h){
        h.setHospitalID(UUID.randomUUID());
        hospitalRepository.registerHospital(h);
    }

    public Hospital getHospitalById(UUID id){
        return hospitalRepository.getHospitalById(id);
    }

    public Doctor getMinimumPatientDoctorInHospital(UUID hospitalId){
        Hospital hos = hospitalRepository.getHospitalById(hospitalId);
        List<Doctor> doctors = hos.getDoctor();
        Doctor minDoctor = null;
        int min = Integer.MIN_VALUE;
        for(Doctor doc : doctors){
            if(min>doc.getPatients().size()){
                min = doc.getPatients().size();
                minDoctor = doc;
            }
        }
        return minDoctor;
    }
}
