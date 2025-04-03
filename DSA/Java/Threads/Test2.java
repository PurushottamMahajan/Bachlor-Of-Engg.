package Threads;

class PrintTable
{
   void print(int n)
  {
	  System.out.println("Table Of "+ n +"Is as Follows");
	  for(int i= 1; i<=10;i++)
	  System.out.println(n +"X"+ i +"="+(n*i));
   try
   {
	  Thread.sleep(200);
    }
    catch(Exception e)
    {
		System.out.println(e);
	}
  }
}
class Thread1 extends Thread
{
	PrintTable t;
	Thread1(PrintTable a)
	{
		t=a;
	}

	public void run()
	{
	  synchronized(t)
	  {
		  t.print(5);
	  }
	}
}
class Thread2 extends Thread
{
	PrintTable t;
	Thread2(PrintTable a)
	{
		t=a;
	}

	public void run()
	{
		synchronized (t)
		{
		 t.print(7);
	 }
	}
}
class Test2
{
	 public static  void main(String args[])
	 {
		 PrintTable table = new PrintTable();
		 Thread1 t1 = new Thread1(table);
		 Thread2 t2 = new Thread2(table);
		 t1.start();
		 t2.start();
	 }
 }
