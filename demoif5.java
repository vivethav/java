class age
{
	int a=85,b=77,c=63;
	public void display()
	{
	 if(a<b)
	 {
	  System.out.println("The youngest one is  " +b);
	 }
	 else if(b>c)
	 {
          System.out.println("The oldest one is  " +a);
	  System.out.println("The youngest one is " +c);
	 }
	 else
	 {
          System.out.println("All are equal age people");
	 }
	}
}
class demoif5
{
	public static void main(String args[])
	{
	 age obj=new age();
	 obj.display();
	}
}