class student
{
	String x;
	public void getmyvalue()
	{
	 x="vivetha";
	}
	public void display()
	{
	 System.out.println(x);
	}
}
class democons
{
	public static void main(String args[])
	{
	 student obj=new student();
	 obj.getmyvalue();
	 obj.display();
	}
}