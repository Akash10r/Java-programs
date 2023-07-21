import java.util.*;
class partition
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        a[0] = 1;
		int i=1,j=i;
        for (i=1;i<=n;i++) 
		{
            for (j=i;j<=n;j++) 
			{
                a[j] =a[j]+a[j - i];
            }
        }
        System.out.println("Number of ways = " +a[n]);
    }
}
/*2
a[3]
a[0]=1
i=1;i<=2 j=1;j<=2
a[0]=1
a[1]=1+0=1
a[2]=1+1=2
2--> 1+1 2+0
5--> 2+2+1 3+2 1+1+1+1+1 4+1 2+1+1+1+ 3+1+1 5+0
*/