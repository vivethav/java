class sample
{
	sample(String name)
	{
	 System.out.println("Inside constructor" +name);
	}
	sample(String str,int x)
	{
	 this(str,int x);
	}
}
class demothis10
{
	public static void main(String args[])
	{
	sample obj=new sample("vivetha",10);
	}
}