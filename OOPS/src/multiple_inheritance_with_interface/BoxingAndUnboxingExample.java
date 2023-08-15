package multiple_inheritance_with_interface;

class MySelf{
	
	void m1(int i) {
		System.out.println("I have int i primitive var-args");
	}
}

public class BoxingAndUnboxingExample {

	public static void main(String[] args) {
		
		Integer x = Integer.valueOf(110);
		MySelf m = new MySelf();
		
		m.m1(x);
				
	}
}
