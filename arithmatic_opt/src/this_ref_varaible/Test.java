package this_ref_varaible;

public class Test {

	int x;
	int y;
	
	void m1() {
		int a = 10;
		int b= 20;
		
		System.out.println(a);  // 10
		System.out.println(b);  //20
		System.out.println(x);   // local >> then  see inside current object >> 100
		System.out.println(y);  // local >> then serach inside current object >> 200
		System.out.println(this.x); // direct search inside current object
		System.out.println(this.y); // direct search inside current object
		//System.out.println(this.a);
		//System.out.println(this.b);
	}
}
