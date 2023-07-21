import java.util.*;
class large
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int temp;
		int[] arr=new int[n];
		int[] arr1=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();

        }               
		while(m!=0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			for(int i=0;i<n;i++)
			{
                arr1[i]=arr[i];
			}
			for(int k=a-1;k<b;k++)
			{
				arr1[k]=0;
			}
            for(int i=0;i<n;i++)                   
			{
				for(int j=i+1;j<n;j++)
				{
                    if(arr1[i]<arr1[j])                            
					{
                        temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
				}
			}
			System.out.println(arr1[0]);
			m--;
        }
	}
}	