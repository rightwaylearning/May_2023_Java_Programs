package list.impl.classes;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //10
		
		list.add(122);
		list.add(890);
		list.add(new Integer(23));
		
		Integer m =567;
		
		list.add(m);
		list.add(122);
		list.add(null);
		list.add(122);
		list.add(null);
		list.add(122);
		list.add(122);
		list.add(null);
		list.add(122);
		System.out.println(list.size());
		
		System.out.println(list);
	}
}
