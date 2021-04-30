class sample
{
	public void getdata()
	{
	 int f=below 25;
	 int e=25 to 45;
	 int d=45 to 50;
	 int c=50 to 60;
	 int b=60 to 80;
	 int a=above 80;
	 if(f<25)
	 {
	  System.out.println("F");
	 }
	 else if((e>=25&&(e<45));
	 {
	  System.out.println("E");
	 }
	 else if((d>=45)&&(d<50))
	 {
 	  System.out.println("D");
	 }
	 else if((c>=50)&&(c<60))
	 {
	  System.out.println("c");
	 }
	 else if((b>=60)&&(b<80))
	 {
	  System.out.println("B");
	 }
	 else if((a>=80)&&(a<=100)) 
	 {
	  System.out.println("A");
	 }
	 else 
	 {
	  System.out.println("Not correct marks");
	 }
	}
}
class demoifelse4
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata();
	}
} 