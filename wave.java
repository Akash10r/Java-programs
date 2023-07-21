import java.util.*;
class wave
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				arr[i] = sc.nextInt();
			}
			
		}
		
		for(j=1;j<=n;j++)
		{
			for(i=1;i<=n;i++)
			{
				System.out.print(i);
			}
			
		}
		
	}
}