package list.impl.classes.list.assignment;

public class Student {

	private Integer rollNumber;
	private String studentName;
	private Double percentage;
	
	public Student() {}

	public Student(Integer rollNumber, String studentName, Double percentage) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.percentage = percentage;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", percentage=" + percentage
				+ "]";
	}
	
}
