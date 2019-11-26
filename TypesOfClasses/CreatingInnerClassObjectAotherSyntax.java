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
       System.out.println("This is Inner Class Constructor");
     }
  }

  public static void main(String[] args)
  { 
    Outer out = new Outer();
    Outer.Inner in= out.new Inner();
    in.innerMethod();  
  }
}