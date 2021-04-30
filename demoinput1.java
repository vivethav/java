import java.io.*;
class sample
{
	DataInputStream din=new
	DataInputStream(System.in);
	sample()
	{
	 try{
	     String str=din.readLine();
	     System.out.println(str);
	    }catch(Exception d){}
	}
}
class demoinput1
{
	public static void main(String args[])
	{
 	 sample obj=new sample();
	}
}
	