package runtime_poly;

import java.util.Iterator;

// var-arg method
class Test11{
	
	void sum(int ...n) {
		
		for(int i =0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
}


public class VarAegMethodExample {

	public static void main(String[] args) {
		
		Test11 t = new Test11();
		
	//	t.sum(10, 20);
	//	t.sum(10, 20,30,40);
//		t.sum(10);
		
		t.sum(1,2,3,4,5,6,7,8,9,0);
	}
}
