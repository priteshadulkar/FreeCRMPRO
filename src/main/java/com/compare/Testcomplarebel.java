package com.compare;

import java.util.ArrayList;
import java.util.Collections;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class Testcomplarebel {

	public static void main(String[] args)
	{
		ArrayList<Agecomparetor> al = new ArrayList<Agecomparetor>();
		al.add(new Agecomparetor("a",27,11));
		al.add(new Agecomparetor("n",20,02));
		al.add(new Agecomparetor("p",29,13));
		al.add(new Agecomparetor("d",22,10));
		al.add(new Agecomparetor("s",24,104));
		
		Collections.sort(al);
		for(Agecomparetor cl :al)
		{
			System.out.println(cl.name +  " " + cl.age+ " "+ cl.rollnumber);
		}
		
		
		
		
	}
}
