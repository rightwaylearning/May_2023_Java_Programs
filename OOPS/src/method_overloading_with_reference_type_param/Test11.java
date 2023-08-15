package method_overloading_with_reference_type_param;

public class Test11 {

	void m1(int i) {
		System.out.println("I am i");
	}
	
	public static void main(String[] args) {
		Test11 t = new Test11();
		t.m1(new Integer(10));
	}
}
