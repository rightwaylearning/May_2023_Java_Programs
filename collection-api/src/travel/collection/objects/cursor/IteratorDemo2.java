package travel.collection.objects.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(123);
		list1.add(456);
		list1.add(6786);
		list1.add(888);

		Iterator<Integer> itr = list1.iterator();

		while (itr.hasNext()) {
			Integer ele = itr.next();
			System.out.println(ele);
		}
		
		// there is one more method of Iterator that is itr.remove()
		
		
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100); ll.add(1000); ll.add(10000); // 3
		
		
		List<Integer> LL= new ArrayList<>(ll); // 3
		LL.add(999);
		System.out.println(LL);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
	}
}
