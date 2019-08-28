package Com.java;



public class VtestCorp3 {
 int sum = 0;
	public int getnumbersum(int number)
	{
		sum = number%10;
		if(sum ==0)
		{
			return 0;
		}
		else {
			
     	return sum + getnumbersum(number/10) ;
		}
	}
	
	
	public static void main(String[] args)
	{
			VtestCorp3 v = new VtestCorp3();
			int a =v.getnumbersum(223);
		System.out.println(a);
		
		
	}
}
