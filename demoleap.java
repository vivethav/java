Class sample
{
	int year=1996;
	public void getdata()
	{
	 if(year % 4==0)
	{
	 if(year % 100==0)
	{
	 if(year % 400==0)
	{
	 System.out.println("leap year");
	}
	 else
	{
	 System.out.println("not a leap year");
	}
	}
}
class demoleap
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}