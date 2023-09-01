package block.examples;

class Test{
	int a;
	int b;
	static int c;
	
	
	
	{
		System.out.println("I am instance block 1");
	}
	
	
	Test(){
		System.out.println("I am Mine constructor");
	}
	
	static{
		System.out.println("I am static block 1");
	}
	
	static{
		System.out.println("I am static block 3");
	}
	
	{
		System.out.println("I am instance block 2");
	}
	
	void m1() {
		System.out.println("I am Mine class m1 method");
	}
	
	public static void main(String[] args) {
		 System.out.println("Main method start...");
		// Test t= new Test();
		 System.out.println("....");
		// Test t1= new Test();
		 System.out.println("...");
		// Test t2= new Test();
		 System.out.println("Main method end...");
	}
	
	static{
		System.out.println("I am static block 2");
	}
	
	{
		System.out.println("I am instance block 3");
	}
	
	static{
		System.out.println("I am static block 4");
	}
}











