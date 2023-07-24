package abstract_class_demo;

public class Controller {

	public static void main(String[] args) {
	// case 1	
//		Child c = new Child();
//		c.m1();
//		c.m2();
//		c.m3();
//		c.m4();
		
	// case 2	
//		Parent p= new Parent();
//		p.m1();
//		p.m2();
	//	p.m3(); // error
	//	p.m4(); // error
		
		// case 3
		Parent p1 = new Child();
		
		p1.m1(); // child class
		p1.m2(); // parent
	
		
		// case 4		
	//	Child c1= new Parent();
		
		
	}
}
