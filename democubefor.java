class sample
{
	sample()
	{
	 int i=0;
	 int n=4;
	 System.out.println("The input number is " +n);
	 for(i=1;i<=n;i++)
	 {
	  System.out.println("The number is "+i+" and cube of "+i+" is " +(i*i*i));
	 }
	}
}
class democubefor
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}