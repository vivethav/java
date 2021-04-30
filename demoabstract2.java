abstract class shape
{
	abstract public void display();
	abstract public void display1();
}
class rectangle extends shape
{
	public void display()
	{
	 System.out.println("Draw Rectangle");
	}
	public void display1()
	{
	 System.out.println("Draw Rectangle1");
	}
}
class circle extends shape
{
	public void display()
	{
	 System.out.println("Draw Circle");
	}
	public void display1()
	{
	 System.out.println("Draw circle1");
	}
}
class demoabstract2
{
	public static void main(String args[])
	{
	 circle obj=new circle();
	 obj.display1();
	}
}
	