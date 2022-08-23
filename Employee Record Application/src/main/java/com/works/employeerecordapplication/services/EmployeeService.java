package com.works.employeerecordapplication.services;

import com.works.employeerecordapplication.entities.Employee;
import com.works.employeerecordapplication.repositories.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
@Service
public class EmployeeService {
    final EmployeeRepository employeeRepo;
    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public ResponseEntity employeeSave(Employee employee) {
        Map<String, Object> hm = new HashMap<>();
        Employee e = employeeRepo.save(employee);
        hm.put("employee", employee);
        return new ResponseEntity(hm, HttpStatus.OK);
    }
    public ResponseEntity employeeList() {
        Map<String, Object> hm = new HashMap<>();
        hm.put("employees", employeeRepo.findAll());
        return new ResponseEntity(hm, HttpStatus.OK);
    }
    public ResponseEntity employeeDelete(String id) {
        Map<String, Object> hm = new HashMap<>();
        try {
            int iid = Integer.parseInt(id);
            employeeRepo.deleteById(iid);
            hm.put("status", true);
        } catch (Exception ex) {
            hm.put("message", "id request : " + id);
            hm.put("status", false);
            return new ResponseEntity(hm, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(hm, HttpStatus.OK);
    }
    public ResponseEntity employeeUpdate(Employee employee) {
        Map<String, Object> hm = new HashMap<>();
        Optional<Employee> oEmployee = employeeRepo.findById(employee.getId());
        if (oEmployee.isPresent()) {
            employeeRepo.saveAndFlush(employee);
            hm.put("message", employee);
            hm.put("status", true);
        } else {
            hm.put("message", "Fail id");
            hm.put("status", false);
        }
        return new ResponseEntity(hm, HttpStatus.OK);
    }
    public ResponseEntity searchIncomeAndDate(String date, Integer income) {
        Map<String, Object> hm = new LinkedHashMap<>();
        Date startedDate = null;
        try {
            startedDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            System.out.println("start date : " + startedDate);
        } catch (Exception ex) {
        }
        List<Employee> ls = employeeRepo.findByStartedDateGreaterThanAndIncomeGreaterThan(startedDate, income);
        hm.put("status", true);
        hm.put("employees", ls);
        return new ResponseEntity(hm, HttpStatus.OK);
    }
    public Employee chooseRandomEmployee(){
        Map<String, Object>  hm = new LinkedHashMap<>();
        List<Employee> employeeList = employeeRepo.findAll();
        Random random = new Random();
        Employee employee = employeeList.stream().skip(random.nextInt(employeeList.size())).findFirst().get();
        return employee;
    }
}