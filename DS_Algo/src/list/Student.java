package list;

public class Student {

	String firstName;
	String lastName;
	Student nextNode;
	
	
	public Student() {}

	public Student(String firstName, String lastName, Student nextNode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nextNode = nextNode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student getNextNode() {
		return nextNode;
	}

	public void setNextNode(Student nextNode) {
		this.nextNode = nextNode;
	}

}
