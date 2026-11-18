package com.kodewala.employee;

public class SalaryCalculator {

	private double basicSalary;
	private double attendancePercentage;

	public SalaryCalculator(double _basicSalary, double _attendancePercentage) {
		this.basicSalary = _basicSalary;
		this.attendancePercentage = _attendancePercentage;
	}

	public double calculateBonus() {

		double bonusPercentage;

		if (attendancePercentage >= 95) {
			bonusPercentage = 15;
		} 
		else if (attendancePercentage >= 90) {
			bonusPercentage = 10;
		} 
		else if (attendancePercentage >= 80) {
			bonusPercentage = 5;
		} 
		else {
			bonusPercentage = 0;
		}

		return basicSalary * bonusPercentage / 100;
	}

	public double calculateFinalSalary() {

		double bonus = calculateBonus();

		return basicSalary + bonus;
	}
}