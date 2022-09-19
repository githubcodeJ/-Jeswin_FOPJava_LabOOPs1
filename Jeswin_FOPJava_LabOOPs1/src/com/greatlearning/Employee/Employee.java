package com.greatlearning.Employee;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		this.setFirstName("Jeswin");
		this.setLastName("Chacko");
		
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
}
