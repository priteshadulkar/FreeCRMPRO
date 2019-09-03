package com.compartor;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
	public static void main(String[] args)
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("az",2,4));
		al.add(new Employee("bz",20,84));
		al.add(new Employee("mz",29,94));
		al.add(new Employee("z",21,49));
		al.add(new Employee("fz",22,54));
		al.add(new Employee("oz",23,40));
		
		// to compare name
		Collections.sort(al,new Name());
		for(Employee sl :al)
		{
			System.out.println(sl.name+" "+ sl.age+ " "+sl.rollnumber);
		}
		System.out.println("===age comparator====");
		Collections.sort(al, new Age());
		 for(Employee sl :al)
		 {
			 System.out.println(sl.name+" "+ sl.age+ " "+sl.rollnumber);
		 }
	}
}
