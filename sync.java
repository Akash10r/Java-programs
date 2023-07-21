class sync
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception c)
			{
				System.out.println(c);
			}
		}
	}
}
class mythread1 extends Thread
{
	sync t;
	mythread1(sync t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}