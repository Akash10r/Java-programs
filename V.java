import java.util.*;
class V
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		for(i=0;i<n/2;i++)
		{
			for(int space=0;space<i;space++)
			{
				System.out.print(i);	
				
			}
			System.out.println("\n");
		}
		
		for(i=n/2;i<=0;i++)          
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println("\n");
		}
	}
}	