class sample
{
	Thread t=new Thread();
	public void run()
	{
	 for(int i=0;i<10;i++)
	 {
	  try{
	      System.out.println("child"+i);
	      t.sleep(1000);
	     }catch(Exception d){}
	 }
        }
}
class demothread1
{
 	public static void main(String args[])
	{
	 Thread t=Thread.currentThread();
 	 sample obj=new sample();
	 obj.run();
	 for(int i=0;i<10;i++)
	 {
	  try{
              System.out.println("main"+i);
	      t.sleep(500);
	      }catch(Exception d){}
	 }
        }
}