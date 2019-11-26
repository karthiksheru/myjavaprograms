class A
{
  A()
  {
    System.out.println("This is A class Constructor");
  }
}
class B extends A
{
  B()
  {
    System.out.println("This is B class Constructor");
  } 
}
class C extends B
{
  C()
  {
    System.out.println("This is C class Constructor");
  }
}
class D extends C
{
  D()
  {
    System.out.println("This is D class Constructor");
  }
  public static void main(String[] args)
  {
    D d=new D();
  }
}
