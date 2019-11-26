class A
{
  int x=10;
}
class B
{
  int y=15;
   A a=new A();
  public static void main(String[] args)
  {
   
    B b=new B();
    System.out.println("The Value of x is = "+b.a.x);
    System.out.println("The value of y is = "+b.y);
  }
}