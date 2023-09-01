package this_constructor_call;


class Test{
	int square;
	
	public Test(int a) {
		super();
		this.square =a*a; 
	}
	
	public Test() {
		this(10);
	}
	
}


class NewTest{
	
	
	
	public NewTest() {
		this(10);
	}
	
	public NewTest(int a) {
		this(10,20);
	}
	
	public NewTest(int a, int b) {
		this(10,20,30); 
		
	}
	
	public NewTest(int a,int b, int c) {
		   super();
	}
	
}    // NewTest n = new NewTest(10,20);


public class Demo {
	public static void main(String[] args) {
         Test t= new Test();
         System.out.println(t.square);
	}
}
