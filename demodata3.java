class sample
{
	int a=10,b=20;
	public void getdata()
	{
	 b=((a+=b)-(a*=2));
	 System.out.println("value of b is :"+b);
	 b=a/=23;
	 System.out.println("value of b is :"+b);
	}
}
class demodata3
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
} 