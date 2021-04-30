class sample
{
	int number=10;
	String result=(number>0)?"Good day":"Good evening";
	public void getdata()
	{
	 System.out.println(result);
	}
}

class demoter
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}