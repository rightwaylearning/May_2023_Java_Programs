package travel.collection.objects.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import list.impl.classes.list.assignment.Student;

public class IteratorDemoWithCustomObject {

	public static void main(String[] args) {
		Student result = null;
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(121, "A", 80.88));
		list.add(new Student(131, "B", 77.88));
		list.add(new Student(141, "C", 94.58));
		list.add(new Student(151, "D", 50.70));
		
		Iterator<Student> itr =  list.iterator();
		
		double percentage  = 0.0;
		while(itr.hasNext()) {
			Student student = itr.next();
			
			if(student.getPercentage() > percentage) {
				percentage = student.getPercentage();
				result = student;
			}
		}
		System.out.println(result);
		
		/*
		 * 
		 * 	
		double percentage  = 0.0;
		for(Student student:list) {
		
			
			if(student.getPercentage() > percentage) {
				percentage = student.getPercentage();
				result = student;
			}
		}
		System.out.println(result);
		 */
	}
}
