package this_ref_new_example;

public class Runner {

	public static void main(String[] args) {
		
		
		Test t1 = new Test();
		t1.a =1;
		t1.b =2;
		
		t1.m1();
		
		System.out.println("-----------------------");
		
		Test t2= new Test();
		t2.a =11;
		t2.b = 22;
		t2.m1();
		
	}
}
