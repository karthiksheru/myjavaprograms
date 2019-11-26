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
}
class C extends B
{
  C()
  {
    System.out.println("C class Constructor");
  }
  public static void main(String[] args)
  {
   C c=new C();
  }
}