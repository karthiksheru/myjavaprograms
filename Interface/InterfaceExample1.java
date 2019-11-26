interface I
{
  abstract void method1();
  void method2();            //The concrete method will be treated as abstract method 
}
class A implements I
{
  public void method1()
  {
    System.out.println("This is abstract method");
  }
  public void method2()
  {
    System.out.println("This is declared as concrete method but this ia also abstract method");
  }
   public static void main(String[] args)
   { 
     A a=new A();
     a.method1();
     a.method2();
   } 
}

