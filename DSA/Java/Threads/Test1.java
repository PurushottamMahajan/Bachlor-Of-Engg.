package Threads;

class Thread1 implements Runnable
{
 public void run()
 {
	 for(int i=0;i<=50;i+=2)
	 System.out.println("Even =="+i);
 }
}
class Thread2 implements Runnable
{
	public void run()
   {
	for(int j=1;j<=50;j+=2)
	System.out.println("Odd== "+j);
	}
}
class Test1
{
	public static void main(String []args)
	{
		Thread t1= new Thread(new Thread1());
		Thread t2= new Thread(new Thread2());

		t1.start();
		t2.start();
	}
}