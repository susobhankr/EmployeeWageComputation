package com.blz;

public class EmployeeWageComputation {
	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;
	static final int SALARY_PER_HOUR = 20;
	static final int TOTAL_WORK_DAY = 20;
	public static void main(String[] args) {
		//Variables
		int empCheck;
		int empHr = 0;
		int totalSalary=0;
		for (int i=1;i<=20;i++) {
			empCheck = (int)(Math.floor(Math.random() * 10) % 3);
			switch(empCheck) {
				case IS_PRESENT :
					empHr = 8;
				break;

				case IS_PART_TIME :
					empHr=4;
				break;

				default :
					empHr=0;
				break;
			}
			double empSalary = empHr * SALARY_PER_HOUR;
			//totalSalary+=empSalary;	
			 totalSalary = totalSalary + (int)empSalary;
		}
		System.out.println("Monthly Emp Wage : "+totalSalary);
	}
}


