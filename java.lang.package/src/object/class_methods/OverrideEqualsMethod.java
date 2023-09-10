package object.class_methods;

class Employee {

	private String name;
	private Integer employeeId;

	public Employee() {
	}

	public Employee(String name, Integer employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		Employee e2 = (Employee) obj;
		if (this.getName().equals(e2.getName()) && this.getEmployeeId().equals(e2.getEmployeeId())) {
			return true;
		} 
		return false;
	}
}

public class OverrideEqualsMethod {

	public static void main(String[] args) {

		Employee e1 = new Employee("AB", 123);
		Employee e2 = new Employee("AB", 123);

		System.out.println(e1.equals(e2)); // false
	}
}
