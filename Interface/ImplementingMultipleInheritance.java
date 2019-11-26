interface I
{
  public void method1();
  abstract void method2();
}
interface J
{
  public void method3();
}
class A implements I,J
{
  public void method1()
  {
    System.out.println("Good Morning");
  }
  public void method2()
  {
    System.out.println("Good Evening");
  }
  public void method3()
  {
    System.out.println("Good night");
  }
  public static void main(String[] args)
  {
    A a=new A();
    a.method1();
    a.method2();
    a.method3();
  }
}