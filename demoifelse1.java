class sample
{
	public void getdata()
	{
	 int a=1;
	 int b=5;
	 int c=2;
	 int result=b*b-4*a*c;
	 if(result>0)
	 {
	 double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
         double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
         System.out.println("The roots are " + r1 + " and " + r2);
	 }
	 else if(result==0)
	 {
	  double r1=-b/(2*a);
	  System.out.println("The roots is" +r1);
	 }
	 else
	 {
	  System.out.println("The equation has no real roots");
	 }
	}
}
class demoifelse1
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}
	 

	  
	  