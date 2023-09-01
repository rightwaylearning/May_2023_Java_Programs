package collection.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		
		List<Student> arrayList= new ArrayList<Student>();
		
		Student s = new Student();
		s.setName("A"); s.setRollNumber(23);
		
		
		Student s1 = new Student();
		s1.setName("B"); s1.setRollNumber(24);
		
		Student s2 = new Student();
		s2.setName("C"); s2.setRollNumber(25);
		
		
		arrayList.add(s);
		arrayList.add(s1);
		arrayList.add(s2);
		
		//---------------------------------------------
		      // s >>> s1>>>>s2
		Iterator<Student> itr =   arrayList.iterator();
		
		// iterator have 3 method
		// 1] hasNext()
		// 2] next
		
		
		
		while(itr.hasNext()) {
			Student obj =itr.next();
			System.out.println(obj.getName());
			System.out.println(obj.getRollNumber());
			System.out.println("-----------------------------");
		}
		
	}
}

















