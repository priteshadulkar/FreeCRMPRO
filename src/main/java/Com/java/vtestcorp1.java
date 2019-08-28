package Com.java;

public class vtestcorp1 {

	public static void main(String[] args)
	{
		int[]  x = { 1,2,3,4};
		 int[] y = x;
		 x= new int[2] ;
		System.out.println(x.length);
		
		for(int i =0 ; i<x.length ;i++) {
			
			
			System.out.println(y[i]);
			//System.out.println(x[i]);
		}
		
	}
}
