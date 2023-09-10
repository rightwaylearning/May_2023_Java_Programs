package list.impl.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMethodsOfAL {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); // 10
		
		System.out.println(list.size());  // 0
		System.out.println(list.isEmpty()); // true
		
		list.add(10);  
		list.add(20);
		System.out.println("before add all =  "+list);  // toString
		
		  //---------------addAll-----------
		       List<Integer> ll= new LinkedList<>();
		       ll.add(100);ll.add(200);ll.add(300);
		  // -------------------------------
		list.addAll(ll); 
		Object[] array = list.toArray();
		System.out.println("--------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------------------");
		System.out.println("after add all =  "+list); 
		System.out.println(list.size());  // 5
		System.out.println(list.isEmpty()); // false
		
		
//		list.clear();
//		System.out.println("after claer method  "+list);
//		System.out.println(list.size());  // 5
//		System.out.println(list.isEmpty()); // false
		
		list.remove(new Integer(10) );
		System.out.println("after remove 10 =>>> "+ list);
		
		//list.removeAll(ll);
		
		//System.out.println("after remove ll =>>> "+ list);
		
		System.out.println(list.contains(20));
		System.out.println(list.containsAll(ll));
		
		System.out.println(list);
		
		list.retainAll(ll);
		System.out.println(list);
	}
}
