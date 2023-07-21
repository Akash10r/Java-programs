
import java.util.*;
class box
{
	double w;
	double h;
	double d;
box()
{
	Scanner obj=new Scanner(System.in);
	w=obj.nextFloat();
	h=obj.nextFloat();
	d=obj.nextFloat();
	double vol=w*h*d;
		System.out.println("VOLUME IS:"+vol);
	}
}
class box2 extends box
{
	box2()
	{
		System.out.println("VOLUME");
	}
}
class mainbox
{
	public static void main(String args[])
	{
		box2 mybox = new box2();
		
	}
}