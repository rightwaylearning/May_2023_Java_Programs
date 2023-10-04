package travel.collection.objects.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		LinkedList<E>
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(301);                       //itr
		list.add(900);
		list.add(605);
		list.add(707);
		
		// in collection there are 3 cursor
		// 1] Iterator(I)
		// 2] ListIterator(I)
		// 3] Enumeration(E)
		
		// 1] Iterator(I)
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			  Integer ele = itr.next();
			   if(ele % 2 == 1) {
				   itr.remove();
			   }
		}
		
		System.out.println(list);
		
	}
}
