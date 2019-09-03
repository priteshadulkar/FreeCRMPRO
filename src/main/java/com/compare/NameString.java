package com.compare;

public class NameString implements Comparable<NameString>{

	String name ;
	int age ;
	int rollnumber ;
	
	NameString(String name , int age, int rollnumber)
	{
		this .name = name ;
		this .age = age ;
		this.rollnumber = rollnumber ;
		
		
	}
	@Override
	public int compareTo(NameString st) {
		// TODO Auto-generated method stub
		return st.name.compareTo(name);
	}

}
