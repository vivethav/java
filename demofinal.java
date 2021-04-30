final class sample
{
	String str;
	sample()
	{
	 str="vivetha";
	 System.out.println(""+str);
	}
}
class sample1 extends sample
{
	sample1()
	{
	 System.out.println(""+str);
	}
}
class demofinal
{
	public static void main(String args[])
	{
	 sample1 obj=new sample1();
	}
}
