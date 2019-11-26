interface I
{
   public void m1();
  abstract void m2();
}
class A implements I
{
  public void m1()
  {
    System.out.println("Hello");
  }
  public void m2()
  {
    System.out.println("Hii");
  }
  public static void main(String[] args)
  {
    A a=new A(); 
    a.m1();
    a.m2();
  }
}