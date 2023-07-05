package flow_controll_assignment;

public class PrintStudentData {

	static void printStudentArray(Student[] arr) {
				
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Name = "+ arr[i].getName() +", Total Marks = "+arr[i].getTotalMarks() +", Grade = "+ arr[i].getGrade());
		    System.out.println("-----------------------");
		}
	}
}
