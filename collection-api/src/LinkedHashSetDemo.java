import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LinkedHashSetDemo {

	
	public static void main(String[] args) {
		HashSet<String> set= new HashSet<>();
		set.add("lmn");
		set.add("abc");
		set.add("erw");
		set.add("lop");
		System.out.println(set);
		
		LinkedHashSet<String> set1= new LinkedHashSet<>();
		set1.add("lmn");
		set1.add("abc");
		set1.add("erw");
		set1.add("lop");
		System.out.println(set1);
		
		//--------------------------------------------------


		   Set<String>  xyz=Collections.synchronizedSet(set);
		   
		   ArrayList<String> al = new ArrayList<>();
		   
		   List<String> s11 = Collections.synchronizedList(al);
		
		   
		   
		   
		   
		   
		  TreeSet<Integer>  t = new TreeSet<>();
		  
		  t.add(123);
		  t.add(13);
		  t.add(45);
		  t.add(13);
		  
		  System.out.println(t);
		  
		  System.out.println("------------------------------");
		  
		  TreeSet<String> names = new TreeSet<>();
		  names.add("sujata");
		  names.add("madhu");
		  names.add("radhika");
		  names.add("poonam");
		  
		  System.out.println(names);
		
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
