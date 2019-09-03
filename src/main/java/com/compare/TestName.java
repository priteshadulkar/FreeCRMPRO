package com.compare;

import java.util.ArrayList;
import java.util.Collections;

public class TestName {
 
	public static void main(String[] args)
	{
		ArrayList<NameString> al = new ArrayList<NameString>();
		al.add(new NameString("z",92,90));
		al.add(new NameString("m",99,70));
		al.add(new NameString("q",29,30));
		al.add(new NameString("b",21,20));
		al.add(new NameString("c",22,10));
		
		Collections.sort(al);
		for(NameString sr :al)
		{
			System.out.println(sr.name+ " "+sr.age+"" + sr.rollnumber);
		}
		
		
		
	}
}
