class sample
{
	int a=2,b=3;
	public void getdata()
	{
	 System.out.println(a==b);
	 System.out.println(a>b);
	 System.out.println(a>=b);
	 System.out.println(a<b);
	 System.out.println(a<=b);
	 System.out.println(a!=b);
	}
}
class demoassign
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}