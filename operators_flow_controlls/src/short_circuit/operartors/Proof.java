package short_circuit.operartors;

public class Proof {

	int a = 10;
	int b = 20;

	boolean m1() {
		System.out.println("I am m1 method");
		boolean r = ++a > 10;
		return r;

	}

	boolean m2() {
		System.out.println("I am m2 method");
		boolean r = b++ > 20;
		return r;
	}
}
