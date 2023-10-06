package comparable.comparator;

import java.util.Comparator;
import java.util.TreeSet;





public class DNSO {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>(new MyOwnWayToSort());
		
		tree.add(10);
		tree.add(20);
		tree.add(12);
		tree.add(85);
		tree.add(20);
		tree.add(90);
		tree.add(85);
		
		
		System.out.println(tree);
		
	}
}


class MyOwnWayToSort implements Comparator<Integer> {

	@Override
	public int compare(Integer x, Integer y) {
		
		// descending order
		
		//return -1 * ((x < y) ? -1 : ((x == y) ? 0 : 1));
		
		//or
		//return -1 * x.compareTo(y);
		
		// or
		
		//return y.compareTo(x);
		
		//---------------------------------------------------------------------
		// do any sorting but allow duplicate
		
		 // case 1:- follow descending order with duplicate items
//		
//		    if(x <= y) {
//		    	return 1;
//		    }else {
//		    	return -1;
//		    }
		
		int t = x.compareTo(y);
		if(t != 0) {
			return t;
		}else {
			return -1;  // Or return 1;
		}
	}
	
}













