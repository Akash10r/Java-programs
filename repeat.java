import java.util.*;
class repeat
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr;
		int i,j,count=0;
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(i=1;i<=n;i++)
		{
			for(j=i+1;j<=n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
					count++; 
					System.out.println(count);
				}	
			}
		}
	}
}	

