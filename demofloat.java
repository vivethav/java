class sample
{
	int x=10,y=3;
	float f=(10.5f);
	public void getdata()
	{
	 if((x<5)&(y>3))
	 {
	  System.out.println("The output is false");
	 }
	 else
	 {
	  System.out.println("The output is true");
	 }
	}
}
class demofloat
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}