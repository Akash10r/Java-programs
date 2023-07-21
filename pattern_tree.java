import java.util.*;
class pattern_tree
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int space=0;space<a-i;space++)
			{
				System.out.print(" ");

			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j );
			}
		
		}
		
		System.out.println(" ");
		
		for(int i=2;i<=a;i++)
		{
			for(int j=i;j<=a;j--)
			{
				System.out.println("#");
			}
			
		}
		
	}
	
} 