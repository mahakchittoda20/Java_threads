package Threads;

class MyAnotherThread extends Thread {
public void run()
{
	for(int i=10;i>=1;i--)
	{
		System.out.println(i);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
	}
	
}

}
