package vector.classes;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ContructorDemo {
	
	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<>();
		v.add(100); v.add(200);
		System.out.println(v.capacity()); //10
		System.out.println(v.size());
		v.add(100); v.add(200);
		v.add(100); v.add(200);
		v.add(100); v.add(200);
		v.add(100); v.add(200);
		System.out.println(v.capacity()); //10
		System.out.println(v.size());
		
		v.add(101);
		
		System.out.println(v.capacity()); //10
		System.out.println(v.size());
		
		// -----------------------------------------------
		Vector<Integer> v1= new Vector<>(200);
		System.out.println(v1.capacity());
		
		System.out.println("-----------------------------");
		
		
		Vector<Integer> vector = new Vector<>(100,5);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		for(int i= 1; i<=100 ;i++ ) {
			vector.add(i);
		}
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		System.out.println("------------------------");
		vector.add(101);
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		
		
		
		 Iterator<Integer> itr  = v.iterator();
		
		
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		
	     Iterator<?> c1 = v.iterator(); 
	     ListIterator<?> c2= v.listIterator();
         Enumeration<?> c3= v.elements();
		
		
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		
		Iterator<Integer> c4  = hs.iterator();
		                       
		
		
		
		
	}

}
