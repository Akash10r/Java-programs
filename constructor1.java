//parameterized constructor
import java.util.*;
class constructor1
{
	int id;
	String name;
	constructor1(int i,String n)
	{
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		constructor1 s1 = new constructor1(01,"Aarthy");
		constructor1 s2 = new constructor1(02,"Akash");
		s1.display();
		s2.display();
	}
}