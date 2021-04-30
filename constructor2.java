class sample
{
	int x=10,y=10;
	sample()
	{
	 System.out.println(x+y);
	}
	public void display(int x,int y)
	{
	 System.out.println(x*y);
	}
}
class constructor2
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display(10,10);
	}
}
	 
	