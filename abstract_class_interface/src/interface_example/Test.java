package interface_example;

interface Mine{
	
	public static final int a = 100;
	public static final String name= "xyz";
	
	void m1();
	void m2();
}

class MySelf implements Mine{
	
    public void m1() {
    	System.out.println("I am m1 method of MySelf");
    }
    
    public void m2() {
    	System.out.println("I am m2 method of MySelf");
    }
	
}



public class Test {

	public static void main(String[] args) {
		
		// case 1
	//	Mine m = new Mine();
		
		// case 2
		
//		MySelf m = new MySelf();
//		m.m1();
//		m.m2();
		
		// case 3
		
		Mine m = new MySelf();
		m.m1();
		m.m2();
		
		// case 4  invalid		
		
	}
}
