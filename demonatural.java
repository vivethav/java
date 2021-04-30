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
	    sum+=i;
           }
	    System.out.println("The Natural numbers upto "+n+" terms  " +sum);
	 }
}
class demonatural
{
	public static void main(String args[])
	 {
	   sample obj=new sample();
	 }
}   	     