package com.tcs.www.employee.info;

public class Runner {

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.employeeId = 23;
		
		e.employeeName = "Rohit";
		e.compnayName = "BCCI";
		e.employeeSalary = 1500000.00;
		
				              
		
		e.employeeAddress = new Address();
				
		e.employeeAddress.homeNumber = "C 505";
		e.employeeAddress.landMark = "baif Road";
		e.employeeAddress.cityName = "Mumbai";
		e.employeeAddress.pinCode = 67890;
	
		
		
		System.out.println(e.employeeId);
		System.out.println(e.employeeAddress.cityName);
		
		
		
		
		
		
	}
}
