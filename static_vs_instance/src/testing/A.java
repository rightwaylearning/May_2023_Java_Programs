package testing;

public class A {
  
	int x =10;
	static int y = 20;
	
	void m1() {
		System.out.println("I am m1 instance method");
	}
	
	static void m2() {
		System.out.println("I am m2 static method");
	}
	
	void me() {
		System.out.println(x);
		// System.out.println(this.x);
		System.out.println(y);
		// System.out.println(A.y);
		m1();
		// this.m1();
		m2();
		// A.m2()
	}
	
	
	static void mySelf() {
	   System.out.println(y);
	   // System.out.println(A.y);
	   m2();
	   // A.m2();
	   A a= new A();
	   System.out.println(a.x);
	   a.m1();
		
	}
	
}
