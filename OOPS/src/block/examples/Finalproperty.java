package block.examples;

public class Finalproperty {

	int a;
	final int b;  // 1
	static int x;
	
	{
		b =90;  // 2
		x= 78;
	}
	
	static {
		x =800;
	}
	
	public Finalproperty() {
		                      // 3
	}
	
	
	
	
	public static void main(String[] args) {
		Finalproperty obj = new Finalproperty(100);
	}
}
