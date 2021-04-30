class sample
	{
	 sample()
	 {
	  System.out.println("I18n solutions");
	 }
         public void getdata()
	  {
	   System.out.println("vivetha");
	  }
	 public void getdata(int x,int y)
	   {
	    return x+y;
	   }
	}
class constructor1
	{
	 public static void main(String args[])
	 {
	  sample obj=new sample();
	  obj.getdata();
	  System.out.println(obj.getdata(10,10));
	 }
	}