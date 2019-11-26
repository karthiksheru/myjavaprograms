import java.util.Scanner;
class A
{
  int addition()
  {
    return a+b;
  }
  int a,b;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    A x=new A();
    System.out.println("Please Enter the value of a ");
    x.a=sc.nextInt();
    System.out.println("Please Enter the value of a ");
    x.b=sc.nextInt();
    int result=x.addition();
    System.out.println("The addition of two Numbers is = "+result);
  }
}