import java.util.Scanner;
class A
{
  void method1()
  {
    System.out.println("Hello");
  }
  void method1(int x)
  {
    System.out.println("Hii");
  }
  public static void main(String[] args)
  {
    A a=new A();
    a.method1();
    a.method1(5); 
 }
}