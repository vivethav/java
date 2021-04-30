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
	     if(x>y)
	      {
	        System.out.println(x+y);
	      }
	     else
	      {
	        System.out.println(x*y);
	      }
	     }catch(Exception d){}
	}
}
class demoinput6
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}