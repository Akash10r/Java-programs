
class newthread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("AA");
		}
	}
}
class thread
{
	public static void main(String args[])
	{
		newthread nt = new newthread();
		nt.start();
	}
}