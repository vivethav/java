class samplee
 {   
    samplee()
	{
         System.out.println("vivetha");
	}
 }
 

class sample extends samplee implements Runnable
 {
   Thread t=new Thread(this);	
	sample()
	{
	t.run();
	}
	public void run()
	{
	  for(int i=0;i<10;i++).
	   {
	      System.out.println(""+i);
	     try{
		      t.sleep(1000);
		}catch(Exception d){}
	
	   }
	}
 }


class demothread4
 {
    public static void main(String asd[])
	{ 

	   sample obj=new sample();
	
	}
 }