package multiple_inheritance_with_interface;

class Mine1{
	
	void m1(long l) {
		System.out.println("long l");
	}
	
//	void m1(double l) {
//		System.out.println("double l");
//	}
}


public class Automaticpromotion {

	public static void main(String[] args) {
		
		Mine1 m = new Mine1();
		byte b = 10;
		m.m1('A');
		
//		float k =10.0F;
//		m.m1(k);
	}
}
