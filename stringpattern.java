import java.util.Scanner;
class stringpattern
{
   public static void main(String args[]) 
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a Word:");
      String s=scan.nextLine();
	  int size=s.length();
	  int i,j;
      for (i=0;i<size;i++) 
	  {
        for (j=0;j<=size/2;j++) 
		{
          if(i==size/2)
		  {
            System.out.print(s);
            break;
          } 
		  else 
		  {
            if(j==size/2)
			{
              System.out.print(s.charAt(i));
			}
            else
			{
              System.out.print(" ");
			}
          }
        }
        System.out.println(); 
      }
   }
}