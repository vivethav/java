class bike
{
	final int speedlimit=90;
	public void limit()
	{
	 System.out.println("The speed limit is "+speedlimit);
	}
}
class demofinalbike
{
	public static void main(String args[])
	{
	 bike obj=new bike();
	 obj.limit();
	}
}