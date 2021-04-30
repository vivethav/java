class sample
{
	sample()
	public void getdata()
	{
	 int a=10,b=20;
	 b=((a+=b)-(a*=2));
	 System.out.println("value of b is :"+b);
	 b=a/=23;
	 System.out.println("value of b is :"+b);
	}
}
class demoope
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
} 