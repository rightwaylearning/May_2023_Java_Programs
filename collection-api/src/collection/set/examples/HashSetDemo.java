package collection.set.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Student {
	private String name;
	private Integer rollNumber;

	public Student() {
	}

	public Student(String name, Integer rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.rollNumber.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Student s = (Student) obj;

			if (this.name.equals(s.name) && this.rollNumber.equals(s.rollNumber)) {
				return true;
			}

			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}

}

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("abc");
		hashSet.add("lmn");
		hashSet.add("yml");
		hashSet.add("abc");

//		System.out.println(hashSet);
//		System.out.println(hashSet.size());  // 3

		// -----------------------------------

		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("A", 101));
		hs.add(new Student("B", 102));
		hs.add(new Student("A", 101));

		System.out.println(hs.size()); // 3
		
		//---------------------------------------
		
		
		  List<Integer>	 list = new ArrayList<>();
		  list.add(108);list.add(101);list.add(103);list.add(101);
		  System.out.println(list);
		  
		  
		  HashSet<Integer> hs1= new HashSet<>(list);
		  System.out.println(hs1);
		

	}
}
// java.lang