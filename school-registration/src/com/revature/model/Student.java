package com.revature.model;

public class Student {

		public String firstName;
		public String lastName;
		public int age;
		public String grade;
		int score;
		
		
		public Student(String firstName, String lastName, int age, String grade) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.grade = grade;
		}
		
		public void printInfo() {
			System.out.println("\nStudent First Name: " + firstName + "\n Student Last Name: " + lastName  + "\n Age: " + age
					+ "\nGrade " + grade);
		}
		public void printGrade() {
			if(score >= 93) {
				System.out.println("Your Grade is : A");
			}else if(score > 80) {
				System.out.println("Your grade is: B");				
			}else if(score >=70) {
				System.out.println("Your grade is: C");
			}else if(score <67) {
				System.out.println("Your grade is F");
			}
		}
}
