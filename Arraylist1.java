import java.util.ArrayList;
class sample
{
	public void getdata()
	{
	 ArrayList<String> cars = new ArrayList<String>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");
         cars.add("Mazda");
         for (String i:cars) 
	 {
          System.out.println(i);
         }
	}
}
class Arraylist1
{
	public static void main(String[] args)
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}