package short_circuit.operartors;

public class Test {

	public static void main(String[] args) {
		
		
	   Proof p = new Proof();
		
		
		if(p.m1() &&  p.m2()) {
			p.b++;
		}else{
			p.a++;
		}
		
		
		System.out.println(p.a); //12  
		System.out.println(p.b); //21
		
		
			
	}
}
