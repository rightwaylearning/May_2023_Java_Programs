package test;

public class Controller {

	public static void main(String[] args) {
		
		Student  student = new Student();
		student.rollNumber = 23;
		student.studentName = "Suresh Matre";
		student.schoolName = "kanegaon high school";
		
		student.address = new Address();
		student.address.line1 = "C 505 B A vermont";
		student.address.line2 =" wagholi pune";
		student.address.pincode = 412207;
		
		student.subjects = new String[4]; // 0-3
		
		student.subjects[0] = "English";
		student.subjects[1] = "Maths";
		student.subjects[3] = "Science";
		student.subjects[3] = "marathi";
		
		PrintInfo  printInfo = new PrintInfo();
		printInfo.showData(student);
	}
}
