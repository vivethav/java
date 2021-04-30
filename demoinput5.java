import java.io.*;
class sample
{
	DataInputStream din=new
	DataInputStream(System.in);
	sample()
	{
	 try{
	     int x=Integer.valueOf(din.readLine()).intValue();
	     int y=Integer.valueOf(din.readLine()).intValue();
	     System.out.println((x+y)-(x*y));
	    }catch(Exception d){}
	}
}
class demoinput5
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}