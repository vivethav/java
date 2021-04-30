import java.io.*;
class sample
{
	DataInputStream din=new
	DataInputStream(System.in);
	sample()
	{
	 try{
	      String name=din.readLine();
	      for(int i=5;i<7;i++)
	      {
	      for(int j=2;j<5;j++)
	       {
	       System.out.println("Name=" +name+j);
	       }
	      }
	    }catch(Exception d){}
	}
}
class demoinput7
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}