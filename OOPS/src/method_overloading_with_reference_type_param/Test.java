package method_overloading_with_reference_type_param;

class P{}
class C extends P{}
class D extends C{}

class MO{
	void m1(P p) {
		System.out.println("method 1");
	}
	
	void m1(C c) {
		System.out.println("method 2");
	}
		
}


public class Test {

	public static void main(String[] args) {
		
		MO obj = new MO();
		
		obj.m1(new D());
	}
}
