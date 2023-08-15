package multiple_inheritance_with_interface;

class AutoBoxing{
	
	void m1(short i) {
		System.out.println("short i");
	}
	
	void m1(char d) {
		System.out.println("char d");
	}
	
	
	void m1(Long i) {
		System.out.println("I have a Long i");
	}
}


public class AutoPromotionWithAutoBoxing {

	public static void main(String[] args) {
		
		AutoBoxing a = new AutoBoxing();
		int i = 10;
		a.m1(i);
		
	}
	
}
