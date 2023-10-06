package treeset_sorting_examples;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	Integer age;

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int compareTo(Person o) {
////		if(this.age < o.age) {
////			return -1;
////		}else if(this.age > o.age) {
////			return 1;
////		}else {
////			return 0;
////		}
//		
//		// OR 
////		return this.age.compareTo(o.age);
//	}

//	@Override
//	public int compareTo(Person o) {
//		int i = this.name.compareTo(o.name);
//		if(i<0) {
//			return 1;
//		}else if(i > 0) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}

	@Override
	public int compareTo(Person o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age > o.age) {
			return 1;
		} else {
			return -1 * this.name.compareTo(o.name);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class CustomSortingOrder {

	public static void main(String[] args) {

		TreeSet<Person> t = new TreeSet<>();

		t.add(new Person("Rani sharma", 28));
		t.add(new Person("Akash madhwal", 28));
		t.add(new Person("Pushpa kakaya", 8));

		for (Person p : t) {
			System.out.println(p);
		}

	}
}
