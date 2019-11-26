class A
{
  A()
  {
   System.out.println("A class Constructor");
  }
}
class B extends A
{
  B()
  {
    System.out.println("B class Constructor");
  }
  public static void main(String[] args)
  {
    B b=new B();
  }
}