import java.util.*;
public class reverseArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements in the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.print("Enter elements of the array:"); 
        for(int i=0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
		
		System.out.println("Reverse order: ");  
         
        for (int i = arr.length-1; i >= 0; i--) 
		{  
            System.out.print(arr[i] + " ");  
        }  
    }
}	
		
		
		
		
		
		
        
        
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
