class A
{
}
class B extends A
{
  public static void main(String[] args)
  {
     B b=new B();
     A a=null;  // if you keep the object value as null it returns false
     if(a instanceof A)
     {
      System.out.println(a instanceof A);
      System.out.println("a is an instanceof specified Class");
     }
     else 
     {
      System.out.println("a is not an instance of specified Class");
     }
     if(b instanceof B)
     {
       System.out.println(b instanceof B);
      System.out.println("b is an instance of specified Class");
     }
      else 
     {
      System.out.println("b is not an instance of specified Class");
     }
 }
}