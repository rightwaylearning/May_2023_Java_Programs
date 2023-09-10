package object.class_methods;

class Mine{
	String name;
	Integer no;
	
	public Mine(String name, Integer no) {
		super();
		this.name = name;
		this.no = no;
	}
	
}

public class EqualsMethodDemo {

	public static void main(String[] args) {
		
		Mine m = new Mine("A",101);
		Mine m1 = new Mine("A",101);
		
		boolean r = m == m1;
        System.out.println(r);	// false
        
		boolean r1 = m.equals(m1);
		System.out.println(r1); // false
		
		
		//-----------------------------
		
		String s1 = new String("A");
		
		String s2 = new String("AB");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		
	}
	
}
