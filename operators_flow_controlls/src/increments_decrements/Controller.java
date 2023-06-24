package increments_decrements;

public class Controller {

	public static void main(String[] args) {
		
		Operations opt = new Operations();
		int x =10;
		int y =20;
		
		int returnValue = opt.m1(++x,--y);
		                // 1] x =x + 1,  x = 11
		               //  2] m1(11,20);
		               //  3] y = y-1; 
		System.out.println(x); // 11
		System.out.println(y); // 19
		
		System.out.println(returnValue);
		
		
		
		
		
		
		System.out.println("-------------------------");

		
		int m = 10;
		
		if(m++ == 11) {
			System.out.println("I am true block- 1");
		}
		// m = 11
		
		if(++m == 11) {
			System.out.println("I am true block -2");
		}
		 // m = 12
		if(m == 13) {
			System.out.println("I am true block -3");
		}
		
		System.out.println(m);
		
		
		
		
	}
}




