
class runnable implements Runnable
{
	@Override
	public void run()
	{
		
		System.out.println("runnable running");
		for(int i=0;i<900;i++)
		{

		System.out.println("run by:"+Thread.currentThread().getName()+",x is:"+i);
		try{
				Thread.sleep(1000);
			}
		catch(InterruptedException e)
			{

			}
		
		}				
	}

}
class Testthread 
{
	public static void main(String[] args) 
	{
		System.out.println("thread is:"+Thread.currentThread().getName());

		runnable r=new runnable();
		Thread t=new Thread(r);
		t.start();
	}
}
