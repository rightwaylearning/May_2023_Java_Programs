package pcak1;

public class A {
 
	final String name ="test";
	int m;
}


class Test{
	public static void main(String[] args) {
		A a=new A();
		a.m =10;
	//	a.name = "hello";
	}
}




abstract class M{
	
	abstract void m1();
	
	void m2() {}
	
}


class N extends M{
	
	void m1() {
		
      final int a = 10;
        a = 100;
	}
}


























