class Parent
{
  public void method1()
  {
    System.out.println("This is parent Class Method");
  }
}
class AnonymousExample
{
  public static void main(String[] args)
  {
    Parent a1 = new Parent()
    {
      public void method1()
      {
        System.out.println("this is Anonymous Class Methods");
      }
    };
    a1.method1();
  }
}