package hashtable_ds;

import java.util.ArrayList;
import java.util.Hashtable;

public class Testing {
	
	public static void main(String[] args) {
		
		 // HashCode >> 
		
		Hashtable<String,Double> table = new Hashtable<String,Double>(); // 
		                                             
		table.put("Java Full stack", 35000.00); // 15/16 >> 15
		table.put("MERN stack", 25000.00);   10/16 >> 10
		table.put("Java developer", 25000.00); 14/16 >> 14
		table.put("MEAN developer", 25000.00);  14/16 >> 14
		table.put("Frotend developer", 17500.00);  17/16 >>1
		table.put("Java Full stack", 50000.00);  >> 15/16 >> 15
		
		
		Double value   = table.get("MERN stack"); 10/16 >> 10
		
		
		System.out.println(value);
		
		//--------------------------------------
		System.out.println(table);
		  /*
		    {
		    Frotend developer=17500.0,
		    Java developer=20000.0, 
		    MERN stack=25000.0, 
		    Java Full stack=35000.0
		   }
		   
		   {
		    Frotend developer=17500.0,
		    Java developer=20000.0, 
		    MERN stack=25000.0, 
		    Java Full stack=50000.0
		   }

		 * 
		 * 
		 * 
		 */
		
		
		int[] arr= new int[5];
		
		//Book[] b = new Book[5];
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
