import java.util.*;

class min_array 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row Count : ");
        int m=sc.nextInt();
        System.out.print("Column count : ");
        int n=sc.nextInt();
        int a[][]= new int[m][n];

        if(m==0 && n==0)
		{
			System.out.print("No Elements in the Array");
		}
		else
		{
			int i,j;
			System.out.println("Enter Array Values : ");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}

			int min=a[0][0];

			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					if(a[i][j]<min)
					{
						min=a[i][j];
					}
				}
			}
			System.out.println("The MINIMUM VALUE in 2D Array is "+min);
		}
    }
}