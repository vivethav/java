class sample 
{
	String x;
	sample()
	{
	 x="vivetha";
	 System.out.println(x);
	}
	int y=2,z=3;
	public void getdata(int x,int y)
	{
	 System.out.println(y*z);
	}
	public void display()
	{
	 short a=-32768;
	 System.out.println(a);
	}
}
class consdata
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata(2,3);
	 obj.display();
	}
}