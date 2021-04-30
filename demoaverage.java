class sample
{
	sample()
       	 {
	  int i,sum=0;
	  int n=7;
	  System.out.println("The first n natural numbers are  " +n);
	  for(i=1;i<=n;i++)
	   {
	    System.out.println(i);
	    sum+=n;
           }
	    avg=sum/5;
	    System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);
         }
}
class demoaverage
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
