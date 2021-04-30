class checkoddeven
{
	int x=10,y=6;
	public void getdata()
	{
	 if((x<5)&(x==6))
	  {
	   System.out.println("10 is even number");
	  }
	 else if((x<y)&(y==5))
	  {
	   System.out.println("6 is not odd number");
	  }
 	 else
	  {
	   System.out.println("Both are even number");
	  }
	}
}
class demoif7
{
	public static void main(String args[])
	{
	 checkoddeven obj=new checkoddeven();
	 obj.getdata();
	}
}