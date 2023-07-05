package equality.operators;

public class Test {

	public static void main(String[] args) {

		int a = 10;

		int b = 100;

		boolean r = a != b;
		
		//System.out.println(r);
		
		
	    // 1] group 7
		
		
		System.out.println(10=='A');
		
		//-------------------------------------------------
		
		boolean b1 = true;
		
		boolean b2 = false;
		
		
		System.out.println(b1!=b2);
		
		
		A a1= new A();
		a1.x =10;
		a1.y =20;
		
		
		A a2= new A();
		a2.x =10;
		a2.y =20;
		
		
		A a3 = a2;
		
		
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a1==a3);
		
		
		
		A aa = new A();
		aa.x =1;
		aa.y = 2;
		
		
		B bb= new B();
		bb.x =1;
		bb.y =2;
		
		
	//	System.out.println(aa==bb);
		
		
	}
}



























