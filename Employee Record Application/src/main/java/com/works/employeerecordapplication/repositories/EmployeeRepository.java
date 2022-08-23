package com.works.employeerecordapplication.repositories;

import com.works.employeerecordapplication.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByStartedDateGreaterThanAndIncomeGreaterThan(Date startedDate, Integer income);
}
