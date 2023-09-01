package SuperConstrcutorCall;

class P {

	int a = 11;
	int b = 22;
	int z = 99;

	void m1() {
		System.out.println("I am P m1 method");
	}
	
	void m2() {
		System.out.println("I am P m12 method");
	}

}

class C extends P {
	int a = 33;
	int b = 44;

	void m1() {
		System.out.println("I am C class m1 method");
	}
	
	void show() {  //  this = c;
		// inside child class we can access parent property directly.
		this.m2();
		System.out.println(super.z);
		System.out.println("-------------");
		System.out.println(this.a);
		System.out.println(this.b);
		this.m1();
		System.out.println(super.a);
		System.out.println(super.b);
		super.m1();
	}

}

public class Demo123 {
	public static void main(String[] args) {
        C c= new C();
        c.show();
	}
}
