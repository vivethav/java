import java.io.*;
class sample
{
	DataInputStream din=new
	DataInputStream(System.in);
	sample()
	{
	 try{
	     String name=din.readLine();
	     String city=din.readLine();
	     String address=din.readLine();
	     String age=din.readLine();
	      
	     
	     System.out.println("Name="+name);
	     System.out.println("City="+city);
	     System.out.println("Address="+address);
	     System.out.println("Age="+age);
	    }catch(Exception d){}
	}
}
class demoinput2
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
