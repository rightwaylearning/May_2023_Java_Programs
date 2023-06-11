package testing.examples;

public class Controller {

	public static void main(String[] args) {
		Test.x =100;
		
		Test t1 = new Test();
		t1.y = 200;
		
		System.out.println(Test.x);
		System.out.println(t1.y);
		
		
		
		Test t2 = new Test();
		t2.y =500;
		
		System.out.println(Test.x);
		System.out.println(t2.y);
	}
}
