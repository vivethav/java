class sample
{
	int number=10;
	public void getdata()
	{
	 if(number<0)
	{
	 System.out.println("The number is positive");
	}
	 else
	{
	 System.out.println("The system block outside");
	}
	}
}
class demodata8
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}