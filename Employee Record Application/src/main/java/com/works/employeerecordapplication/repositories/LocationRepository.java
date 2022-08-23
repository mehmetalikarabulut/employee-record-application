package com.works.employeerecordapplication.repositories;

import com.works.employeerecordapplication.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}