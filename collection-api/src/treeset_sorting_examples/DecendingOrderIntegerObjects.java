package treeset_sorting_examples;

import java.util.Comparator;
import java.util.TreeSet;

public class DecendingOrderIntegerObjects {

	public static void main(String[] args) {
		
		TreeSet<Integer>  t = new TreeSet<>(new MyOwnSoringOrder());
		t.add(100);
		t.add(1);
		t.add(-100);
		t.add(23);
		
		System.out.println(t);
	}
}


class MyOwnSoringOrder implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
//		if(o1 < o2) {
//			return 1;
//		}else if(o1 > o2) {
//			return -1;
//		}else {
//			return 0;
//		}
	  return -1*o1.compareTo(o2);
	}
}








