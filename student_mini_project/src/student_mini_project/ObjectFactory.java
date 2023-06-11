package student_mini_project;

public class ObjectFactory {

	Student getObject(String n, int r, String s) {
		
		Student obj = new Student();
		obj.fullname = n;
		obj.rollNumber = r;
		obj.schoolName =s;
		
		return obj;
		
	}
}
