class sample
{
	int time=20;
	public void getthetime()
	{
	 if(time<18)
	{
	 System.out.println("Good Day");
	}
	else
	{
	 System.out.println("Good Evening");
	}
	}
}
class demotime
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getthetime();
	}
}