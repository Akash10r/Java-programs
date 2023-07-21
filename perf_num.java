import java.util.*;
class perf_num
{
	int i,n;
	int c;
	perf_num()
	{
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				c=c+i;
			}
		}
	}
	void display()
	{
		if(c==n)
		{
			System.out.println(+n +"is a PERFECT NUMBER");
		}
		else
		{
			System.out.println(+n +"is a NOT A PERFECT NUMBER");
		}
	}
	public static void main(String args[])
	{
		perf_num obj = new perf_num();
		obj.display();	
	}
}