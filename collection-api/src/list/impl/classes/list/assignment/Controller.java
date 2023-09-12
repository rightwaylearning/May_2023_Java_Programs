package list.impl.classes.list.assignment;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	
	public static int getFirstRankStudent(List<Student> list) {
		int index  = -1;
		Double percentage = 0.0;
		
		for(int i =0 ; i<list.size();i++) {
			Student student = list.get(i);
			if(student.getPercentage() > percentage) {
				index = i;
				percentage = student.getPercentage();
			}
		}
		
		return index;
	}

	public static void main(String[] args) {
		
		
		List<Student> list = new ArrayList<>();
			list.add(new Student(121, "A", 80.88));
			list.add(new Student(131, "B", 77.88));
			list.add(new Student(141, "C", 94.58));
			list.add(new Student(151, "D", 50.70));
			
			int index = getFirstRankStudent(list);
			
			if(index > -1) {
				System.out.println(list.get(index));
			}else {
				System.out.println("sorry boss there is no any rang one student");
			}
	 }
}
