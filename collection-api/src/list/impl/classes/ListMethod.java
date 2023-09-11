package list.impl.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(100);
		list.add(300);
		list.add(400);
		System.out.println(list);
		
		list.add(3, 800);
		
		System.out.println(list);
		
		List<Integer> childList = Arrays.asList(1,2,3,4,5);
		
		list.addAll(1, childList);
		
		System.out.println(list);
		
		System.out.println(list.remove(6));
		
		System.out.println(list);
		
		list.set(1, 1000);
		
		System.out.println(list);
		
		System.out.println(list.indexOf(100));
		System.out.println(list.lastIndexOf(100));
	}
}
