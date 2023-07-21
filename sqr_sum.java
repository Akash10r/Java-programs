import java.util.*;
class sqr_sum
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number:");
	int a=sc.nextInt();
	int b=a*a;
	System.out.println(b);
	while(b>0)
	{
		b=b%10;
		b=b/10;
		
	}
	System.out.println(b);
	}
}