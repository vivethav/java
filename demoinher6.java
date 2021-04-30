class vehicle
{
	String make;
	String color;
	int year;
	String model;
	vehicle(String make,String color,int year,String model)
	{
	 this.make=make;
	 this.color=color;
	 this.year=year;
	 this.model=model;
	}
	public void getdetails()
	{
	 System.out.println("Manufacturer: " +make);
	 System.out.println("Color: " +color);
	 System.out.println("Year: " +year);
	 System.out.println("Model: " +model);
	}
}
class car extends vehicle
{
	String style;
	car(String make,String color,int year,String model,String style)
	{
	 super(make,color,year,model);
	 this.style=style;
	}
	public void getdetails1()
	{
	 getdetails();
	 System.out.println("Style: " +style);
	}
}
class demoinher6
{
	public static void main(String args[])
	{
	 car obj=new car("KIA","Blue",2019,"Seltos","SUV");
	 obj.getdetails1();
	}
}
