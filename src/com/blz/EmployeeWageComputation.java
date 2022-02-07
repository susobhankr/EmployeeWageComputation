package com.blz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		//Constant
				int IS_PRESENT = 1;
				int IS_PART_TIME = 2;
				int SALARY_PER_HOUR = 20;
				//Variables
				double empCheck = Math.floor(Math.random() * 10) % 3;
				int empHr = 0;
				if (empCheck == IS_PRESENT) {
					empHr = 8;
				} else if (empCheck == IS_PART_TIME) {
					empHr = 4;
				} else {
					empHr = 0;
				}
				double empSalary = empHr * SALARY_PER_HOUR;
				
				System.out.println("Emp Wage : "+empSalary);

	}

}
