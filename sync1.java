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
class mythread2 extends Thread
{
	sync t;
	mythread2(sync t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
class sync1
{
	public static void main(String args[])
	{
		sync obj=new sync();
		mythread1 t1=new mythread1(obj);
		mythread2 t2=new mythread2(obj);
		t1.start();
		t2.start();
	}
}