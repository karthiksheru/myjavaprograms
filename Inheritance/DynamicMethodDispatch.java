class A
{
  public void method1()
  {
    System.out.println("This is A class method1");
  }
  public void method2()
  {
    System.out.println("This is A class method2");
  }
}
class B extends A
{
  public void method2()
  { 
    System.out.println("This is B class method2");
  }
  public void method3()
  {
    System.out.println("This is B class method3"); 
  }
  public static void main(String[] args)
  {
     A a=new B();
     B b=new B();
     b.method3();
     b.method2();
     a.method2();
     a.method1();    
  }
}
/*
Required Output-->
This is B class method3
This is B class method2
This is B class method2
This is A class method1
*/