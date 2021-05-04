package week3.day1.Assignments2p3.org.student;

import week3.day1.Assignments2p2.org.department.Department;

public class Student extends Department {
	public void studentname() {
		System.out.println("student name is prakash");

	}
	public void studentdept() {
		System.out.println("deptmnt is cs");

	}
	public void studentid() {
		System.out.println("id is 16csc137");

	}

	public static void main(String[] args) {
		Student details = new Student();
		details.collegename();
		
	}

}
