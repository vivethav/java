class sample
{
	double a=2.3,b=4,c=5.6;
	double root1,root2;
	double determinant=b*b-4*a*c;
	public void getdata()
	if(determinant>0)
	{
	 root1=(-b+math.sqrt(determinant)) / (2*a);
	 root2=(-b-math.sqrt(determinant)) / (2*a);
	 System.out.println("Roots are unequal");
	}
	else if(determinant==0)
	{
	 root1=root2=-b / (2*a);
	 System.out.println("Roots are real and equal");
	}
	else
	{
	 System.out.println("Roots are real and imaginary");
	}
	}
}
class demoif2
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}