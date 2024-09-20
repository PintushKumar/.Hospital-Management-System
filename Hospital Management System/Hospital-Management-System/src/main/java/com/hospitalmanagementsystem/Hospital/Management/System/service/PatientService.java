package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import com.hospitalmanagementsystem.Hospital.Management.System.repositery.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PatientService {
    @Autowired
    HospitalService hospitalService;
    @Autowired
    BedService bedService;

    @Autowired
    PatientRepository patientRepository;
    public void register(Patient obj){
        // 1.generate unique id
        UUID id = UUID.randomUUID();
        obj.setpId(id);
        // 2. get doctor who is handling minimum patient in that hospital
        Doctor doc = hospitalService.getMinimumPatientDoctorInHospital(obj.getHospitalID());
        obj.setDocId(doc.getDocId());
        doc.getPatients().add(obj);
        // 3. get unoccupied bed
        Bed bed = bedService.getUnOccupiedBedInHospital(obj.getHospitalID());
        obj.setBedId(bed.getBedID());
        bed.setBooked(true);
        bed.setPatient(obj.getBedId());
        bed.setDoctor(doc.getDocId());
        // 4. set status for the bed with docid with bed id
        patientRepository.registerPatient(obj);
    }
}
