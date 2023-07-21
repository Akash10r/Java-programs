import java.util.*;
class merge_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements in the 1st array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		System.out.print("Enter elements of the array:"); 
        for(int i=0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0; i < n; i++)
        {
            b[i] = sc.nextInt();
        }
		for (int i = 0; i < n; i++) 
		{  
            System.out.print(a[i] + " ");  
        } 
		for (int i = 0; i < n; i++) 
		{  
            System.out.print(b[i] + " ");  
        } 
		int len=a.length;
        int i,j;
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
		for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(b[i]>b[j])
                {
                    int temp1=b[i];
                    b[i]=b[j];
                    b[j]=temp1;
                }
            }
        }
		for(i=0;i<len;i++)
        {
            System.out.print(b[i]);
		}
		int[] c = new int[n];
		c[i]=a[i]+b[i];
		for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(c[i]>c[j])
                {
                    int temp2=c[i];
                    c[i]=c[j];
                    c[j]=temp2;
                }
            }
        }
		for(i=0;i<len;i++)
        {
            System.out.print(c[i]);
		}
	}
}