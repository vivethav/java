import java.io.*;
class consvowel
{
	DataInputStream din=new
	DataInputStream(System.in);
	consvowel()
	{
	 try{
 	     char ch[]={W,E,L,C,O,M,E};
	     int i=0;
	     char ch=(char)(din.read());
	     for(i=0;i<ch.length;i++)
	     {
	      if(E=vowel)
	       {
	         continue;
	       }
	      else
	       {
	         System.out.println(W,L,C,M);
	       }
	     }
	    }catch(Exception d){}
        }
}
class demovowels
{
	public static void main(String args[])
	{
	 consvowel obj=new consvowel();	
	}
}