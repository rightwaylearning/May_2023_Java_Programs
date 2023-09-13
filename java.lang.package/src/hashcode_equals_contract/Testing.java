package hashcode_equals_contract;

public class Testing {

	public static void main(String[] args) {
		
		Integer i = new Integer(100);
		
		Integer j = new Integer(100);
		
		System.out.println(i == j); // object class equals method logic
		System.out.println(i.equals(j));
		
		System.out.println(i.hashCode());
		System.out.println(j.hashCode());
		
		//--------------------
		System.out.println("-----------------------------");
		String s1= new String("hello");
		String s2= new String("hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("--------------------------------------------");
		
		Student s11 = new Student("MG", 23, "ABC");
		Student s22 = new Student("ABC", 23, "MG");
		
		System.out.println("--------------------------------");
		
		System.out.println(s11.equals(s22)); 
		
		System.out.println(s11.hashCode());
		System.out.println(s22.hashCode());
			
	}
}
