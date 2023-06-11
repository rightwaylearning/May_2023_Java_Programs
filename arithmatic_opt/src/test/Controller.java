package test;

public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.printStudentDewatils("Siya", 23, 98.78);
		
		String fname = "Madhu";
		int age = 24;
		double p = 85.90;
		
		s.printStudentDewatils(fname, age, p);
		
	}
}
