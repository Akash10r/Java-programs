//write a java program by creating a class with name rect and in that class declare the variables 
//required to find the volume of cuboid and print the resultant variable in the main method

import java.util.*;
class volume
{
	{
		int l,w,h;
		Scanner sc = new Scanner(System.in)
		System.out.println("Length : ");
		int l=sc.nextInt();
		System.out.println("Width : ");
		int w=sc.nextInt();
		System.out.println("Height : ");
		int h=sc.nextInt();
		void display()
		{
			int vol= l*w*h;
			System.out.println("Volume = "+ vol);
		}
	}

class rect
{
	public static void main(String args[])
	{
		volume obj = new volume();
		obj.display();
	}
}
}