package com.compare;

public class Student implements Comparable<Student>{
 
	String name ;
	int age ;
	int rolln ;
	
	public Student(String name , int rolln, int age)
	{
		this .name = name ;
		this.age = age ;
		this .rolln=rolln ;
		
		
	}

	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		
		if(age==st.age)  
			return 0;
		else
			if(age >st.age)
				return 1;
			else
				return -1;
		

	}
	 
	
}
