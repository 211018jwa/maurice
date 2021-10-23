package com.revature.app;

import com.revature.model.Student;
import com.revature.model.Teacher;

public class Main {

	public static void main(String[] args) {

		// Creating objects for the teacher and student
		Teacher teacher = new Teacher("Smith", "Ben", "5B", 2000, 700);
		Student student = new Student("Patrick", "Rob", 24, "A");

		teacher.displayInfo();
		System.out.println();
		teacher.printSalary(2000, 700);
		student.printInfo();
		
		
		
		}

	}


