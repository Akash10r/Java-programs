import java.util.*;
class task
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt;
		}
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt;
		}
		
		
		for(i=0;i<n;i++)
		{
			if(i==0||i==3)
			{
				a[i]++;
			}
			else if(i==1||i==4)
			{
				a[i]--;
			}
			
			
			c[i]=a[i]+b[i];
			
		}
		for(i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
	}
}