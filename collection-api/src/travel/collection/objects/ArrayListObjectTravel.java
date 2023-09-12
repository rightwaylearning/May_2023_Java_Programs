package travel.collection.objects;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjectTravel {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(100);list.add(200);list.add(300);
		list.add(900);list.add(600);list.add(700);
		
		
		// first we are going to travel using control flow like for loo
		// while loop, do while loop & for each
		
		//1] for loop
		
//		for(int i = 0; i <list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		// 2] while loop
		
//		int i = 0;
//		while( i <list.size()) {
//		  System.out.println(list.get(i));
//		  i++;
//	    }
		
		// 3] do while
		
//		int i =0;
//		do {
//			System.out.println(list.get(i));
//			i++;
//		}while(i< list.size());
		
		
		// foreach
		// **** here not required to give init value, terminate condition & increment/decrement
//		for(Integer element:list) {
//			System.out.println(element); // here not required to use get method also
//		}
		
//		String[] names = {"A","B","C","D"};
//		
//		for(String obj:names) {
//			System.out.println(obj);
//		}
		
		
	}
}
