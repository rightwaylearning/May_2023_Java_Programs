package hashcode_equals_contract;

public class Student {

	private String name;
	private Integer rollNumber;
	private String schoolName;
	
	public Student() {}

	public Student(String name, Integer rollNumber, String schoolName) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.schoolName = schoolName;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		if(this.name.equals(s.name) && this.rollNumber.equals(s.rollNumber) && this.schoolName.equals(s.schoolName) ) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.rollNumber.hashCode() + this.schoolName.hashCode();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", schoolname=" + schoolName + "]";
	}
	
	
}
