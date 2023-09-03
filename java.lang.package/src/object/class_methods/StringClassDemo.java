package object.class_methods;

import java.lang.reflect.Field;

public class StringClassDemo {

	 String myFullName;
	 Integer rollNumber;
	
	public static void main(String[] args) {
		
//		String str =new String("hello world");
//		
//		System.out.println(str);
//		System.out.println(str.toString());
//		
//		Integer i = new Integer(10);
//		Integer ii = 20;
//		
//		System.out.println(i);
//		System.out.println(ii);
		
//		String str = "hello";
//		System.out.println(str);
		
//		String str =String.valueOf("hello");
//		System.out.println(str.toString());
		
		
		StringClassDemo s = new StringClassDemo();
	    System.out.println(s.hashCode());
	    
	    String hex = Integer.toHexString(s.hashCode());
	    System.out.println(hex);
	    
	    System.out.println("------------------------");
	    
	    System.out.println(s.toString());
	    
	    System.out.println("-------------------------------");
	    
	    
	    // String toString(); >>> fullyqualifynameof class@hashCode
	    
	    // int hashCode() >>>>>> hashCode() >>> number 
	    
	    //-------------------------------------------------------
	    
	  //  Class getClass() {......}
	    
	   Class obj  = s.getClass();
	    
	    // getClass() method return object of Class class
	  String name = obj.getName();
	  System.out.println(name);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
