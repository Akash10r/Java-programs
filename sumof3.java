import java.util.*;
class sumof3
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a Number : ");
  int n=sc.nextInt();
  int rev=0,t;
  while (n!=0)
	{
		t=n%10;
		rev=rev+t;
		n=n/10;
	}
  System.out.println("Sum of 3 digits is: "+rev);
 }
}