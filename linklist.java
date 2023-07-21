import java.util.*;
class linklist
{
	public static void main(String args[])
	{
		LinkedList <String> a1 = new LinkedList<String>();
		a1.add("AKASH");
		a1.add("AARTHY");
		Iterator <String> Itr = a1.iterator();
		while(Itr.hasNext())
		{
			System.out.println(Itr.next());
		}
	}
}