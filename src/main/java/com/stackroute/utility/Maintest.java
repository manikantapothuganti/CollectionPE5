package com.stackroute.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maintest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Student s1=new Student(1,"amit",18);
		Student s2=new Student(2,"syam",46);
		Student s3=new Student(3,"siv",12);
		Student s4=new Student(4,"mani",04);
		Student s5=new Student(5,"tmc",64);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		Collections.sort(studentList,new StudentSorter());  
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
		
	}
}
