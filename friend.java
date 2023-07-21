import java.util.*;
class friend
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt();
		int a = sc.nextInt();
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		int i,j;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=a*2;j++)
			{
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
			for(i=1;i<=a;i--)
			{
				for(j=2;j<=a-1;j++)
				{
					System.out.print("#");
				}
			}
		
	}
}