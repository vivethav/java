class sample extends Thread
 {
   Thread t=new Thread();
 
    sample()
	{
	  t.start();
	}
	
	public void run()
	{
	  System.out.println("Vivetha ");
	}
 }

 class demothread4
 {
   public static void main(String asd[])
	{
	   sample obj=new sample();
	   sample obj1=new sample();
	}
 }