package Threads;

class Thread1 implements Runnable
{
  public void run()
 {
 System.out.println("INFO PLANET");
 }
 }
 class Thread2 implements Runnable
 {
  public void run()
  {
  System.out.println("GURUKUL OF PROGRAMMING");
  }
 }
 class Thread3 implements Runnable
 {
  public void run()
  {
  System.out.println("BEST CLASS OF PROGRAMMING");
  }
 }
 class Test4
 {
	 public static void main(String ars[])
	 {
		 Thread t = new Thread(new Thread1());
		 Thread t1 = new Thread(new Thread2());
		 Thread t2 = new Thread(new Thread3());
		 t.start();
		 t1.start();
		 t2.start();
	 }
 }