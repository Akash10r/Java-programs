 import java.util.*;
 class numsum
 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,sum=0;
		String str ="52prep2ration6";
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				sum=sum+(str.charAt(i)-48);
			}
		
		}
		System.out.println(sum);
	}
 }