class sample
{
	int x=10,y=10;
	int a=1,b=2;
	public void getdata()
	{
	 x%=5;
	 y-=5;
	 System.out.println(x+y);
	}
	public void display()
	{
	 a+=1;
	 b*=3;
	 System.out.println(a-b);
	}
	public void getmydata(String str)
	{
	 System.out.println("my name is" +str);
	}
	public void getmyvalue()
	{
	 int a=2,b=3;
	 System.out.println("a!=b=" +(a!=b));
	}
}
class demooperator
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	 obj.display();
	 obj.getmydata(" vivetha");
	 obj.getmyvalue();
	}


}