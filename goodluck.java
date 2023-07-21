import java.util.*;
 
 class goodluck 
 {
    public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();		
		int size = a.length();
        int rep=0,maxrep=0;		
		int i,j;
        int last=' ';		
        for (i=0;i<size;i++) 
		{
            char pos=a.charAt(i);
            if (pos==last) 
			{
                rep++;
				
                if(rep>maxrep) 
				{
                    maxrep=rep;
                }
            }
			else
			{
                rep=1;
            }
            last=pos;
        }
        if (maxrep >= 6) 
		{
            System.out.println("Sorry,sorry!");
        }
		else
		{
			System.out.println("Future is good");
		}
    }
}