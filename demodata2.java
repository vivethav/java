class student
{
	int x,y,z;
	public void getdata(int x,int z)
	{
	 System.out.println(x+z);
	}
	public void display(int y,int x)
	{
	 System.out.println(y-x);
	}
}
class demodata2
{
	public static void main(String args[])
	{
	 student obj=new student();
	 obj.getdata(10,20);
	 obj.display(5,10);
	}
}