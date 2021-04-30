import java.io.*;
class average
{
	DataInputStream din=new
	DataInputStream(System.in);
	public void getdata()
	{
	 try{
	     int a=Integer.valueOf(din.readLine()).intValue();
	     int b=Integer.valueOf(din.readLine()).intValue();
	     int c=Integer.valueOf(din.readLine()).intValue();
	     int d=Integer.valueOf(din.readLine()).intValue();
	     int e=Integer.valueOf(din.readLine()).intValue();
	     System.out.println("The average value is : "  +(a+b+c+d+e)/5);
	    }catch(Exception d){}
	}
}
class demoavgw3
{
	public static void main(String args[])
	{
	 average obj=new average();
	 obj.getdata();
	}
}
	 