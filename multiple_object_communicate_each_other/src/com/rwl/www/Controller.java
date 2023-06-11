package com.rwl.www;

public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.rollNumber = 23;
		s.name = "MS Dhoni";
		
		s.schoolDetails = new School();
			s.schoolDetails.registerNumber = "ABC90/900";
			s.schoolDetails.schoolName = "MG school Mumbai";
			
		s.studentAddress = new Address();
		    s.studentAddress.homeNumber = "C 505";
			s.studentAddress.cityName = "Pune";
			s.studentAddress.pinCode = 897654;
			
	   Printer p = new Printer();
	   p.printStudentInfo(s);
	}
}
