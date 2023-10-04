import java.util.HashMap;
import java.util.HashSet;

public class HashSetInternally {

	public static void main(String[] args) {
		
		HashSet<Integer>  hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(10);
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		System.out.println("------------------");
		
		HashMap<Integer,Object>  hashMap = new HashMap<>();
		hashMap.put(10,new Object());
		hashMap.put(20,new Object());
		hashMap.put(30,new Object());
		hashMap.put(10,new Object());
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		
		
	    Object o=hashMap.get(20);
		
	}
}
