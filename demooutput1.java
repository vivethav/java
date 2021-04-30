import java.io.*;
class sample
{
	DataOutputStream dout=new
	DataOutputStream(System.out);
	sample()
	{
	 try{
	     int x=4,y=5;	
	     System.out.println((x+y)-(x*y))
	    }catch(Exception d){}
	}
}
class demooutput1
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}