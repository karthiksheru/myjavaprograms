class Test
{
  public void m1()
  {
    System.out.println("Dont Display");
  }
}
class Anonymous
{
  public static void main(String[] args)
  {
    Test t1 = new Test()
    {
     public void m1()
     {
       System.out.println("Diplay");
     }
    };
   t1.m1();
  }
} 