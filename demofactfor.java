class sample
{
	sample()	
	{
	 int num=1;
	 int fact=1;
	 System.out.println("The positive integer is " +num);
	 for(int i=1;i<=num;i++)
	 {
	  fact *=i;
	 }
	 System.out.println("Factorial " +fact);
	}
}
class demofactfor
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}