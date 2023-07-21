//method
import java.util.*;
class box
{
	double w;
	double h;
	double d;
void display()
{
	Scanner obj=new Scanner(System.in);
	w=obj.nextFloat();
	h=obj.nextFloat();
	d=obj.nextFloat();
	double vol=w*h*d;
		System.out.println("VOLUME IS:"+vol);
	}
}
class box1
{
	public static void main(String args[])
	{
		box mybox = new box();
		mybox.display();
	}
}