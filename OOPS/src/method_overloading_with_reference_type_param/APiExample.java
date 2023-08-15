package method_overloading_with_reference_type_param;

class Mine {

	void m1(Object o) {
		System.out.println("method 1");
	}

	void m1(Number n) {
		System.out.println("method 2");
	}
}

public class APiExample {
	public static void main(String[] args) {

		Mine m = new Mine();

		Integer i = 10;
		m.m1(i); // >> match 100% >> go with parent
		
		Character ch = 'A';
		m.m1(ch); // 
	}
}
