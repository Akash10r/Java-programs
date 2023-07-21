class a implements Runnable
{
	public void run()
	{
		for(int i = 1;i <= 5;i++)
		{
			System.out.println("From thread a:i="+i);
		}
		System.out.println("Exit from a");
	}
}
	class b implements Runnable
	{
	public void run()
	{
		for(int j = 1;j <= 5;j++)
		{
			System.out.println("From thread b:j="+j);
		}
		System.out.println("Exit from b");
	}
	}
	class c implements Runnable
	{
	public void run()
	{
		for(int k = 1;k <= 5;k++)
		{
			System.out.println("From thread c:k="+k);
		}
		System.out.println("Exit from c");
	}
	}
	class thread2
	{
		public static void main(String args[])
		{
			a obj = new a();
			Thread ta = new Thread(obj);
			ta.start();
		}
	}
	