package vector.classes;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		
		Vector<String> v= new Vector<>();
		
		v.add("A");
		v.add("C");
		v.add("A");
		v.add("D");
		v.add(null);
		v.add(null);
		
		System.out.println(v.toString());
	}
}
