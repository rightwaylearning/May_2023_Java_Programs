package flow_controll_assignment;

public class Controller {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Ajit");
		s1.setTotalMarks(45);

		Student s2 = new Student();
		s2.setName("Sudama");
		s2.setTotalMarks(55);

		Student s3 = new Student();
		s3.setName("Krishna");
		s3.setTotalMarks(65);

		Student s4 = new Student();
		s4.setName("Parth");
		s4.setTotalMarks(99);

		Student[] arr = { s1, s2, s3, s4 };

		PrintStudentData.printStudentArray(arr);

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		for (int i = 0; i < arr.length; i++) {

			int marks = arr[i].getTotalMarks();

			if (marks >= 70) {
				arr[i].setGrade("A+");
			} else if (marks < 70 && marks >= 60) {
				arr[i].setGrade("A");
			} else if (marks < 60 && marks >= 55) {
				arr[i].setGrade("B");
			} else if (marks < 55 && marks >= 40) {
				arr[i].setGrade("C");
			} else {
				arr[i].setGrade("Fail");
			}

		}

		PrintStudentData.printStudentArray(arr);

	}
}
