package linkedlist_demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> ll= new LinkedList<>();
		ll.add(12);
		ll.add(20);
		
		System.out.println(ll);
		
		System.out.println(ll.get(1));
	}
}
