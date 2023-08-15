package method_overloading_with_reference_type_param;

class MySelf{
	
	void m1(Object o) {
		System.out.println("method 1");
	}
	
	void m1(String s) {
		System.out.println("method 2");
	}
	
	void m1(StringBuffer s) {
		System.out.println("method 2");
	}
}

public class ReferenceType {

	public static void main(String[] args) {
		
		MySelf m = new MySelf();
		m.m1(null);
	}
}
