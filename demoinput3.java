import java.io.*;
class sample
{
	DataInputStream din=new
	DataInputStream(System.in);
	sample()
	{
	 try{
	     int x=Integer.parseInt(din.readLine());
	     int y=Integer.parseInt(din.readLine());
	     String operator=din.readLine();
	     System.out.println((x*y)+(x-y));
	     System.out.println("Operator="+operator);
	    }catch(Exception d){}
	}
}
class demoinput3
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
