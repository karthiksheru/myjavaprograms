class A
{
  A()
  {
    this(79);
    System.out.println("Hello");
    System.out.println("Good Morning");
  }
  A(int x)
  {
   System.out.println("Hii");
  }
  public static void main(String[] args)
  {
    A a=new A();
  }
}