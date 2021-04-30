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
	     float s1=Float.valueOf(din.readLine()).floatValue();
	     double s2=Double.valueOf(din.readLine()).doubleValue();
	     System.out.println((x*y)/(x+y));
	     System.out.println(+s1);
	     System.out.println(+s2);
	    }catch(Exception d){}
	}
}
class demoinput4
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}