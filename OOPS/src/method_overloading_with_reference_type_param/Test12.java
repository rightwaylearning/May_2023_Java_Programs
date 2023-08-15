package method_overloading_with_reference_type_param;

class AutoMaticMathc{
	
	void m1(Object d) {
		System.out.println("Object o");
	}
	
	void m1(char ch) {
		System.out.println("char ch");
	}
}


public class Test12 {

	public static void main(String[] args) {
		
		AutoMaticMathc a = new AutoMaticMathc();
		 
		Character ch = 'O';
		
		a.m1(ch); // match >> parent >> un boxing >> match >> promotion >> error
		
		a.m1(null);
	}
}
