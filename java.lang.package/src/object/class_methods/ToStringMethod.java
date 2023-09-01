package object.class_methods;

class Student{
	
	private Integer rollNumber;
	private String name;
	private String schoolName;
	
	public Student(Integer rollNumber, String name, String schoolName) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.schoolName = schoolName;
	}
	
	public Student() {}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", schoolName=" + schoolName + "]";
	}
	
	@Override
	public int hashCode() {
		return 100;
	}
}



public class ToStringMethod {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("Arjun");
		s.setRollNumber(23);
		s.setSchoolName("Gurukul");
		
		//System.out.println(s);   // s.toString();
		//--------------------------------------------
		
		// a=hashCode() object class
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = s1;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
