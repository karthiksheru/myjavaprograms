class A
{
  A()
  {
    System.out.println("Hello");
  }
  A(int x)
  {
    this();
    System.out.println("Hii");
  }
  public static void main(String[] args)
  {
   A a=new A(8);
  }
}