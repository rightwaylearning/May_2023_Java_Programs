package cusror.examples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("LMN");
		list.add("OPQ");
		list.add("OPU");
		list.add("eee");
		
		ListIterator<String> itr = list.listIterator();
		
		
		
		
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		System.out.println("----------------------");
		
		while(itr.hasPrevious()) {
			String ele = itr.previous();
			System.out.println(ele);
		}
	}
}
