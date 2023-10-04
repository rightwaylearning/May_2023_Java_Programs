package shallow_cloning.examples;

public class Controller {

	public static void main(String[] args) throws Exception {
		
		Student s= new Student();
		s.name="Sandesh";
		s.percentage = 67.89; 
		s.rollNumber=23;
		s.sc = new School();
		s.sc.name = "MG";
		
		Student s1=(Student)s.clone();		
		
		
		s.percentage = 80.80;
		s.name = "Sandesh Mahi";
		s.sc.name = "TC";
		
		System.out.println(s1.percentage);
		System.out.println(s1.name);
		System.out.println(s1.sc.name);
	}
}
