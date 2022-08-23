package com.works.employeerecordapplication.controllers;

import com.works.employeerecordapplication.entities.Location;
import com.works.employeerecordapplication.services.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationController {
    final LocationService locationService;
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/saveLocation")
    public Location saveLocation(@RequestBody Location location){
        return locationService.saveLocation(location);
    }

    @PutMapping("/updateLocation")
    public ResponseEntity updateLocation(@RequestBody Location location ) {
        return locationService.updateLocation(location);
    }
}
