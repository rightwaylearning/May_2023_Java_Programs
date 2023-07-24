package com.rwl.www;

public class Employee {

	private int employeeId;
	private String name;
	private String maildId;
	private int age;
		
	public Employee() {}

	public Employee(int employeeId, String name, String maildId, int age) {
		this.employeeId = employeeId;
		this.name = name;
		this.maildId = maildId;
		this.age = age;
	}
	
	public Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaildId() {
		return maildId;
	}

	public void setMaildId(String maildId) {
		this.maildId = maildId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
			this.age = age;
	}

}
