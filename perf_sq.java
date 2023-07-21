import java.util.*;
class perf_sq
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		int[] a= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			int num=a[i];
			int r=1;
			while(r*r<num)
			{
				r++;
			}
			int x=num+num;
			if(r*r==num && x<n && num!=1)
			{
				System.out.println(num);
			}
		}

	}
}
 
 