package Threads;
class UserThread extends Thread{
	public void run()
	{
		System.out.println("This is userdefined thread");
	}
}
 class threadOp {

	public static void main(String[] args) {
		System.out.println("program started...");
		int x=56+34;
		System.out.println("sum is  "+x);
		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println("current running thread is  "+tname);
		t.setName("MyMain");
		System.out.println(t.getName());
		try {
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		};
		System.out.println(t.getId());
		System.out.println("program ended");
		UserThread thread=new UserThread();
		thread.start();

	}

}
