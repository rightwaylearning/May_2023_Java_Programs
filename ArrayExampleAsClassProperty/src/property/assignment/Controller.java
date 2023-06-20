package property.assignment;

public class Controller {

	public static void main(String[] args) {

		Product p = new Product();

		p.setProductName("PEN");
		p.setProductPrice(90.78);

		String productName = p.getProductName();
		double productPrice = p.getProductPrice();

		System.out.println(productName);
		System.out.println(productPrice);

		
		
		Student s = new Student();
		
		s.setName("Rohan");
	    s.setRollNumber(23);
	    s.setSchoolName("MG");
	    
	    
	    String name = s.getName();
	    System.out.println(name);
	}
}
