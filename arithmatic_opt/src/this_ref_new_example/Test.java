package this_ref_new_example;

public class Test {

	int a ;
	int b;
	
	void m1() {
		int a = 10;
		int b = 20;
		
		System.out.println(this.a);  // 1
		System.out.println(a); // 10
		System.out.println(this.b); // 2
		System.out.println(b); // 20
		
	}
}
