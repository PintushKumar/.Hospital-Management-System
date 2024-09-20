package com.hospitalmanagementsystem.Hospital.Management.System.repositery;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class BedRepository {
    HashMap<UUID , Bed> bedDb = new HashMap<>();
    public void addBed(Bed obj){
        UUID  id = obj.getBedID();
        bedDb.put(id , obj);
    }
    public  List<Bed> getAllBed(){
        List<Bed> beds = new ArrayList<>();
        for(UUID key : bedDb.keySet()){
            Bed obj = bedDb.get(key);
            beds.add(obj);
        }
        return beds;
    }
}
