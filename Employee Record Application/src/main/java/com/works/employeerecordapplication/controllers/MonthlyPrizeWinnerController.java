package com.works.employeerecordapplication.controllers;

import com.works.employeerecordapplication.entities.MonthlyPrizeWinner;
import com.works.employeerecordapplication.services.MonthlyPrizeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/randomWinner")
public class MonthlyPrizeWinnerController {
  final MonthlyPrizeService monthlyPrizeService;
  public MonthlyPrizeWinnerController(MonthlyPrizeService monthlyPrizeService) {
    this.monthlyPrizeService = monthlyPrizeService;
  }

  @PostMapping("/save")
  public MonthlyPrizeWinner saveWinner(@RequestBody MonthlyPrizeWinner monthlyPrizeWinner) {
    return monthlyPrizeService.saveWinner(monthlyPrizeWinner);
  }
}
