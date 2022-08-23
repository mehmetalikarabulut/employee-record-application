package com.works.employeerecordapplication.controllers;

import com.works.employeerecordapplication.entities.Employee;
import com.works.employeerecordapplication.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    final EmployeeService eService;
    public EmployeeController(EmployeeService eService) {
        this.eService = eService;
    }

    @PostMapping("/save")
    public ResponseEntity employeeSave(@RequestBody Employee employee) {
        return eService.employeeSave(employee);
    }

    @GetMapping("/list")
    public ResponseEntity employeeList() {
        return eService.employeeList();
    }

    @DeleteMapping("/delete")
    public ResponseEntity employeeDelete( @RequestParam String id ) {
        return eService.employeeDelete(id);
    }

    @PutMapping("/update")
    public ResponseEntity employeeUpdate( @RequestBody Employee employee ) {
        return eService.employeeUpdate(employee);
    }

    @GetMapping("/searchIncomeAndDate")
    public ResponseEntity searchIncomeAndDate( @RequestParam String date, @RequestParam Integer income ) {
        return eService.searchIncomeAndDate(date, income);
    }
}
