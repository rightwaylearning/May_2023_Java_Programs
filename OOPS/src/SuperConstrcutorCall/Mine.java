package SuperConstrcutorCall;

class MySelf{
	int a;
	public MySelf() {
		this.a =1;
	}
}


public class Mine  extends MySelf{

	int a ;
	
	public Mine(int a) {
		this.a = a;
	}
	
	void m1() {
		int a = 100;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	
	public static void main(String[] args) {
		
		Mine m = new Mine(10);
		m.m1();
		
	}
}
