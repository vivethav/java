class sample
{
	sample()
	{
	 int numbers[]={12,11,10,30,-30,5,-9};
	 int sum=0;
	 for(int i=0;i<numbers.length;i++)
	 {
	 sum=sum+numbers[i];
	 average=sum/numbers.length;
	 System.out.println("Average values of the array elements is " +average);
	 }
	}
}
class demoarray7
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}