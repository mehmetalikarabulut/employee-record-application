package com.works.employeerecordapplication.services;

import com.works.employeerecordapplication.entities.Location;
import com.works.employeerecordapplication.repositories.LocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class LocationService {
    final LocationRepository locationRepository;
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location saveLocation(Location location){
        return locationRepository.save(location);
    }
    public ResponseEntity updateLocation(Location location){
        Map<String, Object> hm = new LinkedHashMap<>();
        Optional<Location> optionalLocation = locationRepository.findById(location.getId());
        if (optionalLocation.isPresent()){
            Location locationInDB = optionalLocation.get();
            locationInDB.setLocation(location.getLocation());
            hm.put("status", true);
            hm.put("message", "Location updated successfully");
            hm.put("updatedLocation", locationRepository.saveAndFlush(locationInDB));
        }else {
            hm.put("status", false);
            hm.put("message", "Location couldn't update");
        }
        return new ResponseEntity<>(hm, HttpStatus.OK);
    }
}
