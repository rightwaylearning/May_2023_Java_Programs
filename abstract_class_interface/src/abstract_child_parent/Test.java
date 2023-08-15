package abstract_child_parent;


abstract  class Parent {
	
	abstract void m1();
	
	void m2() {
		System.out.println("I am m2 method of Parent class");
	}
}

class Child extends Parent{
	
	void m1() {
		System.out.println("I am m1 method of Child class");
	}
	
	void m3() {
		System.out.println("I am m3 method of Child class");
	}
	
}

 public class Test {

	 
	public static void main(String[] args) {

		// case 1
	//	Parent p = new Parent();   it's invalid
		
		// case 2
		Child c = new Child();
		//c.m1();c.m2();c.m3();
		
		// case 3
		
		Parent p = new Child();
		
		p.m1(); p.m2();  //p.m3();
		
		// case 4
		
	//	Child c1= new Parent();
		
	}
}
