import java.util.*;
public class hashmap
{
	public static String ConvertInteger(int n)
	{
		Map<String,Integer> mp=new LinkedHashMap<>();
		mp.put("M",1000);
		mp.put("CM",900);
		mp.put("D",500);
		mp.put("CD",400);
		mp.put("C",100);
		mp.put("XC",90);
		mp.put("L",50);
		mp.put("XL",40);
		mp.put("X",10);
		mp.put("IX",9);
		mp.put("V",5);
		mp.put("IV",4);
		mp.put("I",1);
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String,Integer> entry:mp.entrySet())
		{
			while(n>=entry.getValue())
			{
				n=n-entry.getValue();
				sb.append(entry.getKey());
			}
		}
		return sb.toString();
	}
		public static void main(String args[])
		{
			int n=877710;
			String result=ConvertInteger(n);
			System.out.println(result);
		}
	
}
		