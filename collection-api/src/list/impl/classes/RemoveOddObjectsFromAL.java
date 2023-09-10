package list.impl.classes;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddObjectsFromAL {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(11);list.add(22);list.add(33);list.add(44);
		list.add(55);list.add(66);list.add(77);list.add(88);
		
		System.out.println(list);
		
		for(int i =0 ; i< list.size() ;i++) {
			Integer elemnet = list.get(i);
			if(elemnet%2 == 1) {
				list.remove(elemnet);
			}
		}
		
		System.out.println(list);
	}
}
