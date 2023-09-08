package Threads;

 class MyThread implements Runnable {
public void run() {
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
public static void main(String args[])
{
	MyThread t=new MyThread();
	Thread thread=new Thread(t);
	thread.start();
	MyAnotherThread obj=new MyAnotherThread();
	obj.start();
}
}
 
