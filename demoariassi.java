class sample
{
	int a=5,b=6;
	public void getdata()
	{
	 System.out.println(a+=2);
	 System.out.println(b%=3);
	 System.out.println((a+=2)+(b%=3));
	 System.out.println(a==b);
	 System.out.println(a!=b);
	}
}
class demoariassi
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}