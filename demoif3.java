class sample
{
	int x=1,y=2,z=3;
	public void getdata()
	{
	 if(x>y)
	 {
	  x=10;
	  y=20;
	  z=30;
	  }
	 else if(y==z)
	 {
	  x=100;
	  y=200;
	  z=300;
	 }
   	 else
	 {
	  x=1000;
	  y=2000;
   	  z=3000;
	 }
	  System.out.println("x" +x);
	  System.out.println("x" +y);
	  System.out.println("x" +z);
	 }
}
class demoif3
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}
