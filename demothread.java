class information extends Thread
{
	Thread t=new Thread(this);
	information()
	{
	 System.out.println("From Tamilnadu");
	 t.setName("Salem");
	 System.out.println(""+t.getName());
	 try{
	    for(int i=0;i<2;i++)
	     {
	      System.out.println("i18n Solutions");
	      t.sleep(1);
	     }
	    }catch(Exception d){}
	}
}
class demothread
{
	public static void main(String args[])
	{
	 Thread t =Thread.currentThread();
	 sample obj=new sample();
	 t.setName("Staff Mr.Sathish");
	 System.out.println(""+t.getName());
	 try{
	     for(int i=0;i<10;i++)
	      {
	       System.out.println("Vivetha"+i);
	       t.sleep(500);
	       System.out.println("Yasika"+i);
	       t.sleep(1);
	      }
	    }catch(Exception d){}
	 }
}
