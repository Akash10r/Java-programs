import java.util.*;

class H
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);		
		int n=sc.nextInt();
		int a=(n*2);
		int i,j;		
		for(i=0;i<a;i++)
		{
			for(j=0;j<a;j++)
			{
				if(j==0 || j==n)
				{
					System.out.print("##");
				}
				if(i==n && j>0 && j<n-1)
				{
					System.out.print("$");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}