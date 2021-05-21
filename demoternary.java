import java.io.*;
class ternary
{
	 public void getdata()
	 {
         try{
	     DataInputStream din=new DataInputStream(System.in);
	     System.out.println("Enter first number");
	     int n1=Integer.parseInt(din.readLine());
	     System.out.println("Enter second number");
	     int n2=Integer.parseInt(din.readLine());
	     int max;
             max=(n1>n2)?n1:n2;
	     System.out.println("Larger of the two numbers " +max);
	    }catch(IOException d){}
	}
}
class demoternary
{
	public static void main(String args[])
	{
	 ternary obj=new ternary();
	 obj.getdata();
	}
} 