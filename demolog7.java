class sample
{
	int x=12,y=20,z=10;
	public void getdata()
	{
	 if ((x>y)|(y>2)&(z<x))
	{
	 System.out.println("Hi vivetha");
	}
	 else
	{
	 System.out.println("Hi yasika");
	}
	}
}
class demolog7
{
	public static void main(String args[])
	{
	sample obj=new sample();
	obj.getdata();
	}
}