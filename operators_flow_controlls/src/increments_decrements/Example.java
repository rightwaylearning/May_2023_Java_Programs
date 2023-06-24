package increments_decrements;

public class Example {

	public static void main(String[] args) {
		
		
        int a = 10; int b = 20;
        
        int c = ++a + b--;  // a = 11 ,
                            // b = 20 
                           // int temp = 11 + 20, 
                           // b = 19 
                           // c =temp;
          System.out.println(b); // 19
          System.out.println(c); // 31
          
            c = --b;
                  // b =18
                  // temp = 18
                  // c =temp // c = 18
            

        int t = --c * --c;
          
        
        
        System.out.println(t); // 272
        System.out.println(c); // 16
	}
}
