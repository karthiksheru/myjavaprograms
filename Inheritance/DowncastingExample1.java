class A
{
}
class B extends A
{
  public static void main(String[] args)
  {
    A a=new B(); //downcating
    B b=(B)a;   //Upcasting
    System.out.println("The value of superclass object is = "+b);
  }
}
