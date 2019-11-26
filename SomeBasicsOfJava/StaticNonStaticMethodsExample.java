class A
{
  void m1()
  {
    System.out.println("This is first non static method");
  }
  static void m2()
  {
    System.out.println("This is first static method");
    A a=new A();
    a.m1(); 
 }
  void m3()
  {
    System.out.println("This is second non static method");
    m2();
  }
  public static void main(String[] args)
  {
     A a=new A();   
     a.m3();
  }
}
/*
Required Output
This is second non static method
This is first static method
This is first non static method*/