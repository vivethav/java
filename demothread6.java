class sample extends Thread
{
	Thread t=new Thread();
	public void run()
	{
	 for(int i=0;i>-5;i--)
	  {
	   try
	     {
	      System.out.println(""+i);
	      t.sleep(500);
	     }catch(Exception d){}
	  }
	}
}
class demothread6
{
	public static void main(String args[])throws Exception
	{
	 sample obj=new sample();
	 obj.start();
	 obj.join();
	 sample obj1=new sample();
	 obj1.start();
	 obj1.join();
	 sample obj2=new sample();
	 obj2.start();
	}
} 