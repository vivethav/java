import java.util.ArrayList;
class sample
{
     public void getdata()
      {
	ArrayList<String>cars=new ArrayList<String>();
	cars.add("Volvo");
	cars.add("BMW");
	cars.add("Ford");
	cars.add("Audi");
	cars.add("Renault");
	System.out.println(cars);
      }
}
class Arraylist
{
	public static void main(String[] args)
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}
	 
	