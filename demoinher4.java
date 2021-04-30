class sample
{
	int x,y;
	sample()
	{
	 x=100;
	 y=100;
	}
	public void getsample()
	{
	 int sum=x+y;
	 System.out.println("Sum= " +sum);
	}
}
class sample1 extends sample
{
	sample1()
	{
	 x=10;
	 y=10;
	}
	public void getsample1()
	{
	 int mul=x*y;
	 System.out.println("Multiplication= " +mul);
	}
}
class demoinher4
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getsample1();
	}
}
 
