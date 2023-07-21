//try catch
import java.lang.Throwable;
import java.util.*;
class trycatch
{
	public static void main(String args[])
	{
		trycatch obj=new trycatch(); 
		obj.divide();
		obj.add();
	}
	void add()
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result=n1+n2;
		System.out.println(result);
	}
	void divide()
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try
		{
			int result=n1/n2;
			System.out.println("Division:"+result);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("please enter valid value for n2");
			divide();
		}
	}
}