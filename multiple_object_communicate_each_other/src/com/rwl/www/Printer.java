package com.rwl.www;

import java.io.PrintStream;

public class Printer {

	void printStudentInfo(Student obj) {
		
		
		System.out.println(obj.name);
		System.out.println(obj.rollNumber);
		System.out.println("------------------");
		System.out.println(obj.studentAddress.homeNumber);
		System.out.println(obj.studentAddress.cityName);
		System.out.println(obj.studentAddress.pinCode);
		System.out.println("----------------------");
		System.out.println(obj.schoolDetails.registerNumber);
		System.out.println(obj.schoolDetails.schoolName);
		
		
	}
}
