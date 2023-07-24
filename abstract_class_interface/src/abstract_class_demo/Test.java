package abstract_class_demo;

class P{
	void m1() {
		System.out.println("OK");
	}
	void m2() {
		System.out.println("bye");
	}
}

class C extends P{
	void m1() {
		System.out.println("tata");
	}
	void m3() {
		System.out.println("good night");
	}
	
}

class K extends C{
	void m3() {
		System.out.println("good morning");
	}
}


public class Test {

	public static void main(String[] args) {
		
		P p= new K();
		p.m1(); // tata
		p.m2(); // bye
	//	p.m3();
	}
}
