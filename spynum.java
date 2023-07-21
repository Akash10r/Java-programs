import java.util.*;
class spynum
{
	public static void main(String args[])
	{
	int i,n,last;
	int s=0,p=1;
	{
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			last=n%10;
			s=s+last;
			p=p*last;
			n=n/10;
		}
		if(s==p)
			System.out.println("It is a spy number");
		else
			System.out.println("It is not a spy number");
	}
	}
}
