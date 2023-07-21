import java.util.*;
public class rearrange 
{  
   public static void main(String[] args) 
   {  
      int[] a = { 1,2,3,4,5};  
      int n = 5;    
      for(int i = 0; i < n; i++) 
	  {  
         System.out.println(a[i]);  
      }  
      for(int i = 0; i < n-1; ++i) 
	  {  
         for (int j = i + 1; j < n; ++j) 
		 {  
            if (a[i](a[j]) > 0) 
			{  
               int temp = a[i];  
               a[i] = a[j];  
               a[j] = temp;  
            }  
         }  
      }  
      
      for(int i = 0; i < n; i++) 
	  {  
         System.out.println(a[i]);  
      }  
   }  
}  