import java.util.*;
public class count_subarr 
{
	public static void main(String args[]) 
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) 
		{
            arr[i]=sc.nextInt();
        }
		int i,j,count = 0;
        for (i=0;i<n;i++)
		{
            int sum = 0;
            for (j=i;j<n;j++) 
			{
                sum=sum+arr[j];
				double sqrt=Math.sqrt(sum);
				if(sqrt*sqrt==sum)
				{
                    count++;
                }
            }
        }
		System.out.println(count);
	}
}