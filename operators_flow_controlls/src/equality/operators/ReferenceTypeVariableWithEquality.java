package equality.operators;

public class ReferenceTypeVariableWithEquality {

	public static void main(String[] args) {
		
		
		M m1= new M();
		
		N n1= new N();
		
		
		M m2 = new M();
		
		
		Object o1= new Object();
		
		
	//	System.out.println(m1==n1);
		
	//	System.out.println(o1==n1);
		
		System.out.println(m1==m2);
		
	}
}

