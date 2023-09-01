package runtime_poly;

class P{
	public void m1() {}
}

class C extends P{
	
	public void m1() {} 
}


public class ModifiersInCaseOfMethodOverriding {

	public static void main(String[] args) {
		
	}
}




interface PPP{
	 void m1();
}

class CCC implements PPP{
	
	public void m1() {
		// Cannot reduce the visibility of the inherited method from PP
	}
}




















