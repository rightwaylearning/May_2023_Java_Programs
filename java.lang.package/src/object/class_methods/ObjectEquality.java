package object.class_methods;

class Student11{
	String name;
	Integer rollNumber;
}

//  boolean equals(Object o){
  
    // return this == o;
    
//}

public class ObjectEquality {

	public static void main(String[] args) {
		
		Student11 s = new Student11();
		s.name ="Mithun";
		s.rollNumber = 23;
		
		
		Student11 s1= s;
		
		boolean b = s.equals(s1);
		System.out.println(b);
		
	}
}























