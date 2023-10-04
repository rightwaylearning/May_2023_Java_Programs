package cusror.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("LMN");
		list.add("OPQ");
		System.out.println(list);
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			if(itr.next().equals("LMN")) {
				itr.remove();
			}
		}
		System.out.println(list);
		

	}
}
