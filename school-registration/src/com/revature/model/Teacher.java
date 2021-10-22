package com.revature.model;

public class Teacher {
	public String firstName;
	public String lastName;
	public String classroom;
	public int salary;
	public int bonus;
	
	public Teacher(String firstName, String lastName, String classroom, int salary, int bonus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.classroom = classroom;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public void displayInfo() {
		System.out.println("First Name:  " + firstName + "\n Last Name:  " + lastName + "\n Classroom: " + classroom + " \nBonus: " + bonus
				+ "\n Salary: " + salary);
	}
	
	public void printSalary(int bonus, int salary) {
		int monthlySalary= salary + bonus;
		System.out.println("My monthly Salary: " + monthlySalary);
	}
	

}
