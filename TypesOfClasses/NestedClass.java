class Outer
{
  int y = 30;
  static class Inner
  { 
    Outer out =new Outer();
    public void method()
    {
     System.out.println(out.y); 
    }
   }
  public static void main(String[] args)
  { 
    Outer.Inner in =new Outer.Inner();
    in.method();
  }
}
