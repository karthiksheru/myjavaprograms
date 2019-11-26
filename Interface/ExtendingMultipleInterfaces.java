interface I
{
  public void method1();
  abstract void method2();
}
interface J
{
  public void method3();
}
interface K extends I,J
{
  abstract void method4();
}
class A implements I,J,K
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
    System.out.println("Good Night");
  }
  public void method4()
  {
    System.out.println("Good Afternoon");
  }
  public static void main(String[] args)
  {
    A a=new A();
    a.method1();
    a.method2();
    a.method3();
    a.method4();
  }
}