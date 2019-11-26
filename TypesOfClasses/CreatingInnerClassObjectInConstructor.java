class Outer
{
  class Inner
  {
     public void innerMethod()
     {
       System.out.println("This is inner class method");
     }
     Inner()
     {
       System.out.println("This is Inner class Constructor");
     }  
   }
  Outer()
  {
    Inner in =new Inner();
    in.innerMethod();
  }
  public static void main(String[] args)
  {
   Outer out = new Outer();
  }
}