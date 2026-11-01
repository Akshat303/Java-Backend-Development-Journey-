package com.day38_practiceOOPs.company;

import java.math.BigDecimal;

public class SalaryCalculator {

    // Bonus logic based on employee type (LSP compliant)
    public BigDecimal calculateTotalCompensation(Employee employee) {
        BigDecimal base = employee.getBaseSalary();

        if (employee instanceof Manager manager) {
            // Managers get an incentive per team member managed
            BigDecimal teamBonus = BigDecimal.valueOf(manager.getTeamSize()).multiply(new BigDecimal("1000.00"));
            return base.add(teamBonus);
        }

        if (employee instanceof Developer) {
            // Developers get a fixed technical allowance
            BigDecimal techAllowance = new BigDecimal("3000.00");
            return base.add(techAllowance);
        }

        return base;
    }
}