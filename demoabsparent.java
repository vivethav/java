abstract class parent
{
	abstract public void display();
	abstract public void display1();
	}
class parent1 extends parent
{
	public void display()
	{
	 System.out.println("This is first class");
	}
	public void display1()
	{
	 System.out.println("This is second class");
	}
	
}
class demoabsparent
{
	public static void main(String args[])
	{
	 parent1 obj=new parent1();
	 obj.display();
	 obj.display1();
	}
}
	 