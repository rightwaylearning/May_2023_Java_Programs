package super_constructor_call;

class Parent {

	public Parent(int a, int b) {
	}

	public Parent() {}  // solution-2
	void m1() {
		System.out.println();
	}

}
//---------------------------------------

class Child extends Parent {
	
	public Child(int a, int b) {
		super(a,b);
	}
	

	void m2() {
		
	}
}

public class SuperDemo {

	
}
