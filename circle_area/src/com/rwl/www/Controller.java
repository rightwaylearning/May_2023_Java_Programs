package com.rwl.www;

public class Controller {

	public static void main(String[] args) {
		CircleArea.pi = 3.14;
		

		
		CircleArea c1 = new CircleArea();
		c1.redius = 5.0;
		double r1 = c1.calculateAreaOfCircle();
		System.out.println(r1);
		
		System.out.println("----------------------------");

		
		CircleArea c2 = new CircleArea();
		c2.redius = 4.5;
		double r2 =  c2.calculateAreaOfCircle();
		System.out.println(r2);
		
		System.out.println("----------------------------");
		
		CircleArea c3 = new CircleArea();
		c3.redius = 3.5;
		double r3 = c3.calculateAreaOfCircle();
		System.out.println(r3);
		
		
	}
}
