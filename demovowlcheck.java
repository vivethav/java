import java.io.*;
class consvowel
{
	DataInputStream din=new
	DataInputStream(System.in);
	consvowel ()
	{
	 try{
	     System.out.println("Enter a character");
	     char ch=(char)(din.read());
	     if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='')
	     {
	      System.out.println("given character is an vowel");
	     }
	     else
	     {
	      System.out.println("given character is an consonant");
	     }
            }catch(Exception d){}
	}
}
class demovowels1
{
	public static void main(String args[])
	{
	 consvowel obj=new consvowelcheck();
	}
}
	 