class sample
{
	sample()
	{
	 int numbers[]={3,3,5,-5,12,3};
	 int sum=0;
	 for(int number:numbers)
	 {
	  sum+=number;
	 }
	  System.out.println("sum=" +sum);
	}
}
class demoarray5
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
