package object.class_methods;

class MySelf{
	
	String name;
	
	void m1() {
		System.out.println(this.hashCode());
	}
}

public class ThisRefProof {

	public static void main(String[] args) {
		
		MySelf t1= new MySelf();
		t1.name = "A";
		
		System.out.println(t1.hashCode());
		t1.m1();
				
		
	}
}
