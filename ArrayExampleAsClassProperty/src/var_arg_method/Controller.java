package var_arg_method;

public class Controller {

	public static void main(String[] args) {
		
		
		Cal c= new Cal();
		
		c.sum(10,20,30,40,50);
		
		System.out.println("----------");
		
		c.sum(100,200);
		
		System.out.println("-----------");
		
		c.sum(89,67,89);
		
		System.out.println("-----------");
		
		c.sum();
		
		c.printStudentName("Radha","Madhura","Ravi","Raghav");
		
	}
}
