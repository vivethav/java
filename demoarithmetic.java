class sample
{
	int x=7,y=8;
	public void display()
	{
	 x+=2;
	 y*=1;
	 System.out.println(x+y);
	 x-=2;
	 System.out.println(x-y);
	 System.out.println(x/y);
	}
}
class demoarithmetic
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display();
	}
}