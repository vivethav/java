class A
{
	public void getdata()
	{
	 System.out.println("THIRD");
	}
}
class B extends A
{
	public void getdata1()
	{
	 System.out.println("SECOND");
	}
}
class C extends B
{
	public void getdata2()
	{
	 System.out.println("FIRST");
	}
}
class demoinher3
{
	public static void main(String args[])
	{
	 C obj=new C();
	 obj.getdata();
	 obj.getdata1();
	 obj.getdata2();
	 }
}