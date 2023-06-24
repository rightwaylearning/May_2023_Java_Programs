package concatination.opetaors;

public class Test {

	public static void main(String[] args) {
		
		String s1 = "hello";
		
		String s2 ="hi";
		
		String str = s1 + s2;
		
		System.out.println(str);
		
		//---------------------------------
		
		String m1= "hello";
		String m2= " Good morning";
		
		System.out.println(m1 + m2);
		
		//------------------------------------
		
		System.out.println("hello" + "hi");
		
		//
		int a = 10;
		
		String marks = " Maths ";
		
		System.out.println(marks + a); // Maths 10
		
		//----------------------------------------------
		
		
		int x = 10;
		int y = 30;
		int sum = x + y;
		
		System.out.println("x + y = " + sum);
		
		//----------------------------------------------
		
		String name= "Mahesh";
		
		System.out.println("My Fisrt Name " + name);
		
		//------------------------------------------------
		
	    String result = 10 + 20 + 30 + "10";
	          //= 30 + 30 + "10";
	          //  = 60 + "10"
		      //  = "6010"
	    System.out.println(result);//
	    
	    
	    //---------------------------------------------------
	    
	    String result1 = 10 + 20 + "30" + 1 + 2;
	               //  =  30 + "30" + 1 +2
	               //  = "3030" + 1 + 2;
	              //   = "30301" + 2;
	              //   = "303012"
	     
	    System.out.println(result1);  //"303012"
	    
		//--------------------------------------------
	    
	    String str1 = 1 + 2 + "0" + 1 + 2;
	    System.out.println(str1);
		
		
		//-----------------------------------------------
	    int a1 = 10;
	    int b1 = 20;
	    
	    String str2 = a1 + "10" + b1 + "20";
	    System.out.println(str2);
	    //-----------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
	}
}
