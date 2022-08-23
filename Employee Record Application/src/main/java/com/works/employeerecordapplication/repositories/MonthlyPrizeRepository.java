package com.works.employeerecordapplication.repositories;

import com.works.employeerecordapplication.entities.MonthlyPrizeWinner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyPrizeRepository extends JpaRepository<MonthlyPrizeWinner, Long> {
}