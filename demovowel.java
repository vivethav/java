import java.io.*;
class sample
{
	DataInputStream din=new
	DataInputStream(System.in);
	sample()
	{
	 try{
	     char ch=(char)(din.read());
	     {
	     if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
	      {
	       break;
	      }
	       System.out.println("");
	     }
	    }catch(Exception d){}
	}
}
class demovowel
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
	