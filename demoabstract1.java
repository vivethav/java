abstract class sample
 { 
    abstract  public void display(int x,int y);
    abstract public void display1(String str1,String str2);
 }
class sample1 extends sample
 {
    
    public void display(int x,int y)
 {
    System.out.println(x-y);
    System.out.println(x*y);
 }
    public void display1(String str1,String str2)
 {
         System.out.println("Concatenation"+ (str1+str2));
 }
 }
class demoabstract1
 {
   public static void main(String asd[])
 {
    sample1 obj=new sample1();
    obj.display(10,10);
    obj.display1("Vivetha","Software Developer");
 }
 }