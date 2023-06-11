package com.sarswati.mandir.www;

public class Controller {

	 public static void main(String[] args) {
		
		 Circle c = new Circle();
		 c.pi = 3.14;
		 c.redius = 4.5;
		 
		double  result = c.calculateCircleArea();
		System.out.println(result);
	}
}
