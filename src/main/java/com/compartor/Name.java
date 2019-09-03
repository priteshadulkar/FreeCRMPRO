package com.compartor;

import java.util.Comparator;

public class Name implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee s1=(Employee)o1;  
		Employee s2=(Employee)o2;
		return s1.name.compareTo(s2.name);
	}

	

	


	
	

}
