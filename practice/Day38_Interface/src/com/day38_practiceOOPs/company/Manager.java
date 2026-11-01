package com.day38_practiceOOPs.company;

import java.math.BigDecimal;

public class Manager extends Employee {
    private final int teamSize;

    public Manager(String id, String name, BigDecimal baseSalary, int teamSize) {
        super(id, name, baseSalary);
        if (teamSize < 0) {
            throw new IllegalArgumentException("Team size cannot be negative.");
        }
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public String getRole() {
        return "Engineering Manager";
    }
}