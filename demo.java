class sample
{
	public void getdata(int x,int y)
	{
	 System.out.println(x*y);
	}
	public void getdata(String str)
	{
	 System.out.println("my centre name is " +str);
	}
}
class demo
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata(10,10);
	 obj.getdata(" i18n solutions");
	}
}