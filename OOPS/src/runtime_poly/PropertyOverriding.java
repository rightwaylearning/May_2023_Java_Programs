package runtime_poly;

class P12{
	int x = 100;
	
	void m1() {
		System.out.println("i am P12 m1 method");
	}
}
class C12 extends P12{
	
	int x =10000;
	
	@Override
	void m1() {
		System.out.println("I am C12 m1 method");
	}
}



public class PropertyOverriding {

	public static void main(String[] args) {

		P12 p = new C12();
		p.m1();
		System.out.println(p.x);
	}
}
