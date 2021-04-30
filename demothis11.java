class sample
{
	sample()
	{
	 System.out.println("Welcome to Constructor");
	}
	sample(int x,int y)
	{
	 this();
	 System.out.println("called");
	}
}
class demothis11
{
	public static void main(String args[])
	{
	 sample obj=new sample(10,11);
	}
}
