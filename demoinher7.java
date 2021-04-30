class calculation
{
	int z;
	public void addition(int x,int y)
	{
	 z=x+y;
	 System.out.println("The sum of given numbers: " +z);
	}
	public void subtraction(int x,int y)
	{
	 z=x-y;
	 System.out.println("The differene between the given numbers: " +z);
	}
}
class math_calculation extends calculation
{
	public void multiplication(int x,int y)
	{
	 z=x*y;
	 System.out.println("The product of the given numbers: "+z);
	}
}
class demoinher7
{
	public static void main(String args[])
	{
	 math_calculation obj=new math_calculation();
	 int a=10,b=10;
	 obj.addition(a,b);
	 obj.subtraction(a,b);
	 obj.multiplication(a,b);
	}
}
