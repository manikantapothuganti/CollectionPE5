package com.stackroute.utility;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if(student1.getAge()>student2.getAge())
			return 1;
		else if(student1.getAge()==student2.getAge())
			{
				if(student1.getName().compareTo(student2.getName())==0) {
					if(student1.getId()>student2.getId())
						return 1;
					else 
						return -1;
				}
				else
					return student1.getName().compareTo(student2.getName());
			
			}
		else 
			return -1;
	}

}
