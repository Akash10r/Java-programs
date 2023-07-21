import java.util.*;
class bulb
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements in the array:");
		int n = sc.nextInt();
		int i, j;
		int count = 0;
		int a[] = new int[n];
		System.out.print("Enter the elements of the array:"); 
		for (i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
        }
		for(i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
			for(j=i;j<n;j++)
			{
                if (a[j] == 0)
				{
					a[j] = 1;
				}
				else
				{
					a[j]=0;
                }                                           
            }                                                
		} 
		System.out.println(count);
	}
	
}

        