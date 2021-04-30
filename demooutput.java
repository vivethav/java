import java.io.*;
class sample
{
	DataOutputStream dout=new
	DataOutputStream(System.out);
	sample()
	{
	 try{
	     for(int i=0;i<10;i++)
	     {
	      if(i>3)
	      break;
	       {
		System.out.println(i);
	       }
	     }
	    }catch(Exception d){}
	}
}
class demooutput
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}