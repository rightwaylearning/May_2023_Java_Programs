package exampple2;

public class Me {

	int a;
	int b;
	static int x;
	static int y;
	
	void m1() {
	  System.out.println(this.a);	
	  System.out.println(this.b);	
	  System.out.println(Me.x);	
	  System.out.println(Me.y);	
	}
	
	static void m2() {
		System.out.println(Me.x);
		System.out.println(Me.y);
	}
		
}
