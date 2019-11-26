class A
{
  A(int x)
  {
    System.out.println("Hello");
  }
  A()
  {
  }
  public static void main(String[] args) 
  {
    A a=new A(5); 
    A a1=new A();
  }
}