class sample
{
	int x,y;
	sample()
	{
	 x=10;
	 y=10;
	 System.out.println(x+y);
	}
}
class sample1 extends sample
{
	{
	 x=100;
	 System.out.println(x);
	}
}
class demoinher
{
	public static void main(String args[])
	{
	 sample1 obj=new sample1();
	}
}
	