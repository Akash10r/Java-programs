import java.util.*;
class diamond
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		{
		for(int i=1;i<=n;i++)
		{
			for(int space=0;space<n-i;space++)
				{
					System.out.print(" ");

				}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		for(int i=n-1;i<=1;i--)
		{
			for(int space=0;space<n-i;space++)
				{
					System.out.print(" ");

				}
			for(int j=i-1;j<=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		}
}	
	
}