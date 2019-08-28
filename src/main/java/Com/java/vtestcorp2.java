package Com.java;

import java.util.HashSet;
import java.util.Set;

public class vtestcorp2 {

	public static void main(String[] args)
	{
		Set s =new HashSet();
		s.add(new Long(10));
		s.add(new Integer(10));
		for(Object object : s )
		{
			
			System.out.println("test -"+ object);
		}
		
		// which is not a override funca
		//same mathod name +same argument type+different paramter
		
		
	}
}
