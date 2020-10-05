public class Overloding 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=2, b=3;
			int result1=method1(a,b);
			double x=1.2, y=2.1;
			double result2=method1(x,y);
			System.out.println("Minimum =" + result1);
			System.out.println("Minimum =" + result2);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+ e);
		}
	}
	public static int method1(int a, int b)
	{
		return (a+b);
	}
	public static double method1(double x, double y)
	{
		return (x+y);
	}
}