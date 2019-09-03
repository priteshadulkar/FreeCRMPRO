package com.compare;

import java.util.Comparator;

public class Agecomparetor implements Comparable<Agecomparetor> {

	String name ;
	int age ;
	int rollnumber ;
	 
	Agecomparetor(String  name ,int age ,int rollnumber)
	{
		this .name = name ;
		this .age = age ;
		this.rollnumber = rollnumber ;
		
		
	}
	// single list of element compare using compare to mathod
	

	public int compareTo(Agecomparetor cn) {
		// TODO Auto-generated method stub
		if(rollnumber==cn.rollnumber )
			return 0;
		else
		{
			if(rollnumber>cn.rollnumber)
				return 1;
			else 
				return -1;
			
		}
	}
	
	
	
}
