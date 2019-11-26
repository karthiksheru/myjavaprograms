import java.util.Scanner;
class Example2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter your First Name");
    String fname=sc.next();
    Example1 a=new Example1();
    a.setFirstName(fname);
    String result=a.getFirstName();
    System.out.println("The First Name which you have entered is = "+result);
  }
}