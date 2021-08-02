class sample extends Thread
{
	Thread t=new Thread();
	public void run()
	{
	 for(int i=0;i<10;i++)
	  {
	   try
	     {
	      System.out.println(""+i);
	      t.sleep(500);
	     }catch(Exception d){}
	  }
	}
}
class demothread7
{
	public static void main(String args[])throws Exception
	{
	 sample obj=new sample();
	 sample obj1=new sample();
	 obj.start();
	 obj.join(4000);
	 obj1.start();
	 }
} 