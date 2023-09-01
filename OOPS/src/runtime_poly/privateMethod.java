package runtime_poly;


class MySelf11{
	private void m1() {
		System.out.println("I am parent class private method");
	 }
	
		
}
	
	
class Me extends MySelf11{
	
	private void m1() {
	   System.out.println("I am child cladss private method");	
	}
}
	
	

public class privateMethod {

	public static void main(String[] args) {
		MySelf11 m = new Me();
		// this.m1();
	}
}


abstract class MM{
	abstract void m1();
}

abstract class NN extends MM{
	
}





















