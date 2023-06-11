package student_mini_project;

public class Runner {

	public static void main(String[] args) {
		
		ObjectFactory f = new ObjectFactory();
		
		Student s = f.getObject("Atul", 23, "MG");
		
		Printer p = new Printer();
		p.printData(s);
	}
}
