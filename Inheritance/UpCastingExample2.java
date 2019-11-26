class A
{
}
class B extends A
{
  public static void main(String[] args)
  {
   B b=new B(); //subclass Object
   A a=b;   //assigning of subclass object to super class
   System.out.println("The subclass Object which is being Upcasted = "+a);
  }
}