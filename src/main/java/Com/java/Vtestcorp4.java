package Com.java;

public class Vtestcorp4 {
	 int sum = 0;
	    public static void main(String[] args) 
	    {
	        int n;
	       
	        Vtestcorp4 obj = new Vtestcorp4();
	        int a = obj.add(224);
	        System.out.println("Sum:"+a);
	    }																																																																																																																																																																																																																																																																																																																																												
	    int add(int n)
	    {
	        sum = n % 10;
	        if(n == 0)
	        {
	            return 0;
	        }
	        else
	        {
	             return sum + add(n / 10);
	        }
	 
	    }
}
  





