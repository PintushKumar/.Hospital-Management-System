package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.repositery.BedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BedService {
    @Autowired
    BedRepository bedRepository;
    public Bed getUnOccupiedBedInHospital(UUID hospitalId){
        List<Bed> beds = bedRepository.getAllBed();
        for(Bed bd : beds){
            if(bd.isBooked() == false && bd.getHospitalId() == hospitalId){
                return bd;
            }
        }
        return null;
    }

    public void addBed(UUID hospitalId){
        Bed bed = new Bed();
        bed.setBedID(UUID.randomUUID());
        bed.setHospitalId(hospitalId);
        bedRepository.addBed(bed);
    }
}
