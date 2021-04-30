class absolutevalue
{
	int x=1;
	public void getmyvalue()
	{
	 if(x<0)
	 {
	  System.out.println("Absolute value "  +(-1*x));
	 }
	 else
	 {
 	  System.out.println("Absolute value "  +x);
	 }
	}
}
class demoif6
{
	public static void main(String args[])
	{
	 absolutevalue obj=new absolutevalue();
	 obj.getmyvalue();
	}
}