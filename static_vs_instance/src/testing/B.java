package testing;

public class B {

	void publish() {
		
		A a= new A();
		System.out.println(a.x);
		a.m1();
		System.out.println(A.y);
		A.m2();
		
	}
	
	static void show() {
		A a= new A();
		System.out.println(a.x);
		a.m1();
		System.out.println(A.y);
		A.m2();
	}
}
