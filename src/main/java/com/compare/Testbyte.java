package com.compare;

import java.util.ArrayList;
import java.util.Collections;

public class Testbyte {
  public static void main(String[] args)
  {
	  
	  ArrayList<Student> a = new ArrayList<Student>();
	  a.add(new Student ("A",101,24));
	  a.add(new Student ("b",102,125));
	  a.add(new Student ("C", 103,27));
	  a.add(new Student ("D",104 ,19));
	  
	  Collections.sort(a);
	  System.out.println("1st sortinf sequence is ="+a);
	  for(Student st: a)
	  {
		  System.out.println(st.name+" " +st.rolln+ " "+st.age);
	  }
	  
	  
	  
  }
}
