class sample extends Thread
{
	Thread t=new Thread();
	sample()
	{
	 System.out.println("class sample called");
	 t.start();
	}
	public void run()
	{
	 System.out.println("I am called by my name run");
	}
}
class demothread2
{
	public static void main(String args[])
	{
	 sample obj1=new sample();
	}
}