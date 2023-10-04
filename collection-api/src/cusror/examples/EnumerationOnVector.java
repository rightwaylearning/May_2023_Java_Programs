package cusror.examples;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationOnVector {

	public static void main(String[] args) {
		
		Vector<String> list = new Vector<>();
		list.add("ABC");
		list.add("LMN");
		list.add("OPQ");
		list.add("OPU");
		list.add("eee");
		
			
		Enumeration<String> em = list.elements();
		
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
