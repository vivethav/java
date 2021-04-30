class sectionA
{
	String x;
	String y;
	sectionA()
	{
	 x="Vivetha";
	 y="Yasika";
	}
	public void display()
	{
	 System.out.println("The first name is " +x);
	 System.out.println("The second name is " +y);
	}
}
class sectionB extends sectionA
{
	sectionB()
	{
	 x="Mangai";
	 y="Priya";
	 z="Kavya";
	}
	public void display1()
	{
	 System.out.println("The first name is " +x);
	 System.out.println("The second name is " +y);
	}
}
class demoinher5
{
	public static void main(String args[])
	{
	 sectionB obj=new sectionB();
	 obj.display1();
	}
}