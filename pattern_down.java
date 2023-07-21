import java.util.*;
public class pattern_down
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
		int x=1;
		int y=0;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(y);					
				}				
				else
				{
					System.out.print(x);
				}				
			}
			System.out.println( );
		}
	}
}