class SuperClass
{
}
class SubClass extends SuperClass
{
  public static void main(String[] args)
  {
    SubClass sub=new SubClass();
    SuperClass sup=sub;
    System.out.println("The upcasting object is = "+sup);   
  }
} 