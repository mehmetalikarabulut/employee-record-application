package com.works.employeerecordapplication.services;

import com.works.employeerecordapplication.entities.Employee;
import com.works.employeerecordapplication.entities.MonthlyPrizeWinner;
import com.works.employeerecordapplication.repositories.MonthlyPrizeRepository;
import org.springframework.stereotype.Service;

@Service
public class MonthlyPrizeService {
  final MonthlyPrizeRepository monthlyPrizeRepository;
  final EmployeeService employeeService;

  public MonthlyPrizeService(MonthlyPrizeRepository monthlyPrizeRepository, EmployeeService employeeService) {
    this.monthlyPrizeRepository = monthlyPrizeRepository;
    this.employeeService = employeeService;
  }
  public MonthlyPrizeWinner saveWinner(MonthlyPrizeWinner monthlyPrizeWinner) {
    Employee employee = employeeService.chooseRandomEmployee();
    monthlyPrizeWinner.setEmployee(employee);
    return monthlyPrizeRepository.save(monthlyPrizeWinner);
  }
}
