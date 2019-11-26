class A
{
  int addition()
  {
    return a+b;
  }
  int a,b;
  public static void main(String[] args)
  {
    A x=new A();
    x.a=10;
    x.b=20;
    int result=x.addition();
    System.out.println("The addition of two Numbers is = "+result);
  }
}